package lecture2;

import java.util.Scanner;

public class prac2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("氏名を入力してください：");
        String name = sc.nextLine();
        System.out.print("学籍番号を入力してください：");
        int num =sc.nextInt();
        System.out.printf("氏名：%s , 学籍番号：b%d",name,num);
    }
}
