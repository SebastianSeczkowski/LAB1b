package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.Account;
import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;
  
import java.util.Scanner;  

public class IsPalindromeTest {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	do {
		System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
		String tekst = scn.next();
		if (tekst.equals("0")) break;
		System.out.print("Tekst: " + tekst + " " +
				(StringFun.isPalindrome(tekst) ? "" : "nie ")+
				"jest palidromem");
		} while (true);
	}		
}
