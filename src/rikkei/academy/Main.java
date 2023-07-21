package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width");
        float width= Float.parseFloat(scanner.nextLine());
        System.out.println("Enter height");
        float height= Float.parseFloat(scanner.nextLine());
        float area=width+height;
        System.out.println("Diện tích hình chữ nhật :"+area+"cm");
    }
}
