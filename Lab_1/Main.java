import java.io.*;
import java.util.*;

public class Main {
	public static boolean isPalindrom(String s) {
		String t = "";
		for (int i=s.length()-1;i>=0;i--) {
			t+=s.charAt(i);
		}
		return s.equals(t);
	}
	public static boolean isPrime(int x) {
		for (int i=2;i<x;i++) {
			if (x%i == 0) {
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (args.length == 0) {
			System.out.println("HELLO WORLD");
		}
		else if (args.length == 1) {
			System.out.println(args[0]);
			if (isPalindrom(args[0])) {
				System.out.println("Is palindrom");
			}
			else {
				System.out.println("Not Palindrom");
			}
		}
		else if (args.length == 2){
			try {
			    int num = Integer.parseInt(args[0]);
			    if (num < 0) {
			    	System.out.println("Number cannot be negative");
			    	return;
			    }
			    while (num-- != 0) {
			    	System.out.println(args[1]);
			    }
			}
			catch(Exception e) {
			    System.out.println("Input cannot be converted to int");
			}
		}
		else {
			System.out.println("Too many arguments");
		}
		System.out.println("Enter the number");
		try {
			int x = scan.nextInt();
			if (x < 1) {
				System.out.println("Incorrect Input");
				return;
			}
			if(isPrime(x)){
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
		}
		catch(Exception e) {
			System.out.println("Please enter an integer.");
		}
		
		
		
	}

}
