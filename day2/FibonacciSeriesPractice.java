package week1.day2;

public class FibonacciSeriesPractice {

	public static void main(String[] args) {

		 

	    int n = 20, first = 0, second = 1;

	    System.out.println("Fibonacci Series till " + n + " terms:");

	 

	    for (int i = 1; i <= n; ++i) {

	      System.out.print(first + ", ");

	 

	      // compute the next 

	      int next = first + second;

	      first = second;

	      second = next;

	    }

	  }

	

}
