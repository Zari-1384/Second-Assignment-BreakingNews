package AP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Infrastructure newinfra = new Infrastructure("8d9fab819f3a445f89f7c54b7ef807c7");
        newinfra.displayNewsList();
        ArrayList<News> breakingNews = newinfra.getNewsList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        breakingNews.get(number - 1).displayNews();
    }
}