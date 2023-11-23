package app;

import java.util.Scanner;

public class Main1 {
    static String[] items;
    static int count;
    static String pattern;
    static int cnt;


    public static void main(String[] args) {

        items = new String[]{"laptop", "smartphone", "earphones", "tablet", "e-book",
                "laptop", "laptop", "headphones"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input item: ");

        pattern = sc.nextLine();
        for (String item : items) {
            count++;
            if (item.equals(pattern)) {
                cnt++;
            }
            System.out.println(count + ") " + item);
        }
        System.out.println(pattern + "(s) - " + cnt + " item(s)");

        sc.close();
    }
}

