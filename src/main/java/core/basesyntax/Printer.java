package core.basesyntax;

import java.util.Arrays;

public class Printer {
    public String print(String message) {
        return message;
    }

    public String print(int message) {
        return String.valueOf(message);
    }

    public String print(double message) {
        return String.valueOf(message);
    }

    public String print(String message, int number) {
        return message + " " + number;
    }

    public String print(String[] message) {
        return Arrays.toString(message);
    }

//    public String print(String[] message) {
//        StringBuilder sb = new StringBuilder();
//        for (String el : message) {
//            sb.append(el);
//            sb.append(" ");
//        }
//        return sb.toString();
//    }

//    public String print(String[] message) {
//        String result = "";
//
//        for (int i = 0; i < message.length; i++) {
//            result += message[i];
//            result += " ";
//        }
//        return result;
//    }


    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.print("Hello world"));
        System.out.println(printer.print(1));
        System.out.println(printer.print(1.1));
        System.out.println(printer.print("Hello", 5));
        System.out.println(printer.print(new String[]{"Hello", "all", "people", "of", "the", "world"}));

    }
}
