package week1.day2;

import java.util.Scanner;

public class Palindrome {
	 
	 public static void main(String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number"); 
	 // getting input from a user 
	 int num=sc.nextInt();
	 int original_num = num;
	 int rev= 0;
	 while (num!=0) {
		 rev=rev*10 + num%10;
		 num=num /10;
		 
	 }
	 if (original_num == rev) {
		 System.out.println(original_num + " is a Palindrome Number");
	 }
	 else {
		 System.out.println(original_num + "is not a Palindrome Number");
	 }
	}
	 
}