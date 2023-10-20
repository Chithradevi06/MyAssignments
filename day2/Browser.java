package week1.day2;

public class Browser {

	 
		public String launchBrowser(String browser) {
			System.out.println("Browser lanched successfully");
			return browser;
			
		}

	

	private void loadUrl() {
		
		System.out.println("Application url launched successfully");
	}
   public static void main(String[] args) {
	Browser brn=new Browser();
	System.out.println(brn.launchBrowser("edge"));
	brn.loadUrl();
}
}
