package labII;

public class passwordmanager {
private int  oldpassword =12345;
private int newpass=786;
private boolean correctpassword=true;
 void updatepassword( int password) {
	 if(oldpassword==password) {
		System.out.println("your new password is 786");
	 }
	 else {
	 }
	 System.out.println("please enter your previous password correctly");
 }
 boolean validatepassword(int newpassword) {
	 if(newpassword==newpass) {
		 correctpassword=true;
		return correctpassword;
	 }
	 else {
		 correctpassword=false;
			return correctpassword;
	 }
 }

	

}
