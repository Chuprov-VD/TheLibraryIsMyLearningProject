package library;

import java.util.Scanner;

public class Printing {

    public static String printScanner() {

        Scanner scanner = new Scanner(System.in);
        //scanner.close(); - не закрывать, чтобы можно было использовать в других классах
        return scanner.nextLine();
