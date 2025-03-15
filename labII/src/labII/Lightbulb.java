package labII;

import java.util.Scanner;

public class Lightbulb {
    private boolean isON = false;

    public void turnON() {
        isON = true;
        System.out.println("The bulb is now ON.");
    }

    public void turnOFF() {
        isON = false;
        System.out.println("The bulb is now OFF.");
    }

    public void showStatus() {
        if (isON) {
            System.out.println("The bulb is currently ON.");
        } else {
            System.out.println("The bulb is currently OFF.");
        }
    }
}
