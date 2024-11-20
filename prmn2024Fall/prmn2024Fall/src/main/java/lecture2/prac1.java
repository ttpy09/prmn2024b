package lecture2;
import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        String number = "B2001000";
        Scanner sc = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。:");
        String gakuseki = sc.next();
        Gakuseki g = new Gakuseki();
        g.hantei(number, gakuseki);
    }
}
