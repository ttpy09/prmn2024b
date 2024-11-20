package lecture2;
import java.util.Scanner;
public class prac4 {
    public static void main(String[] args) {
        String[][] gakuseki = new String[5][2];
        Scanner sc = new Scanner(System.in);
        //学籍番号、パスワードの設定
        for (int i = 0; i < gakuseki.length; i++) {
            for (int j = 0; j < gakuseki[i].length; j++) {
                if(j==0){
                    System.out.print("学籍番号を入力してください:");
                    gakuseki[i][j] = sc.nextLine();
                }else if(j==1){
                    System.out.print("パスワードを入力してください:");
                    gakuseki[i][j] = sc.nextLine();
                }
            }
        }
        System.out.print("ログイン情報（学籍番号）を入力してください:");
        String gakubann = sc.nextLine();
        pasuwa p = new pasuwa();
        p.gakubann(gakuseki, gakubann);
        System.out.print("パスワードを入力してください:");
        String pass = sc.nextLine();
        p.hantei(gakuseki,pass);

    }
}
