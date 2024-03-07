package my_try;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner console_input = new Scanner(System.in);
    static Scanner fileScanner;
    public static Scanner getConsoleScanner(){return console_input;
    };
}
//just using the regular Scanner causes issues as cant access it from within multiple classes. this public class lets us always access the scanner