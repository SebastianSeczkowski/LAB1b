package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.Account;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Account acc = new Account();
        acc.name = "Piotr Gołabek";
        System.out.println(acc.getName());

    }
}
