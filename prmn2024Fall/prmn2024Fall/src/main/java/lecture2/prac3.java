package lecture2;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {

        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.printf("数字%dつ目",i);
            num[i] = sc.nextInt();
            System.out.println("");
        }
        Keisan k = new Keisan();
        int x = k.goukei(num);
        k.hantei(x);
    }
}
