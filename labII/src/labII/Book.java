package labII;

public class Book {
		private String title= "monster";
		private String author= "david";
		 private boolean  isIssued=true;
		
		boolean  issuebook(String a) {
			if(title.equals(a)) {
				isIssued = true;
				return isIssued;
			}
			else {
				isIssued=false;
				return isIssued;

			}

}
		boolean returnbook(String a) {
			if(title.equals(a)) {
			return false;
			}
			else {
				return true;
			}
			
		}
		void showstatus(String a){
			if(title.equals(a)) {
				System.out.println("Monster by david is issued and it is not availale at the moment");
			}
			else {
				System.out.println("Monster by david is not issued and it is availale at the moment");

			}
		}
}
		
