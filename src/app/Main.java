package app;

import java.util.Scanner;

public class Main {


    static String[] items;
    static int count;
    static String pattern;
    static int cnt;


    public static void main(String[] args) {

        items = new String[]{"laptop", "smartphone", "earphones", "tablet", "e-book",
                "laptop", "laptop", "headphones"};

        for (String item : items) {
            count++;
            System.out.println(count + ") " + item);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Input item from the list:  ");

        pattern = sc.nextLine();
        for (String item : items) {
            if (item.equals(pattern)) {
                cnt++;
            }
        }
        System.out.println(pattern + "(s) - " + cnt + " item(s)");
        sc.close();
    }
}