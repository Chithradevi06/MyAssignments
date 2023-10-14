package week1.day1;

public class LearnSwitchCase {
	public static void main(String[] args) {
		String browser = "DuckDuckgo";
		switch (browser) {
			case "Chrome": System.out.println("Open Chrome Browser"); break;
			case "Safari": System.out.println("Open Safari Browser"); break;
			case "Edge": System.out.println("Open Edge Browser"); break;
			case "ie": System.out.println("Open ie Browser"); break;
			default : System.out.println("Open Firefox Browser"); break;
		}
		
	}

}
