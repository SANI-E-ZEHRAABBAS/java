package labII;


	class TemperatureConverter {
	    private double temperature;

	    
	    public void setCelsius(double value) {
	        temperature = value;
	    }

	    public void setFahrenheit(double value) {
	        temperature = (value - 32) * 5 / 9;
	    }

	    public void toFahrenheit() {
	        System.out.println("Temperature in Fahrenheit: " + ((temperature * 9 / 5) + 32) + "°F");
	    }

	    public void toCelsius() {
	        System.out.println("Temperature in Celsius: " + temperature + "°C");
	    }
	}

	


