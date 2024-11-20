package lecture2;

public class pasuwa {
    public int gakubann(String[][] gaku,String ban){
        for(int i=0;i<gaku.length;i++){
            if(gaku[i][0].equals(ban)){
                return i;
            }
        }
        System.out.println("error!!");
        System.exit(0);
        return 0;
    }
    public void hantei(String[][] gakusei,String nyuryoku,int x){

        if(gakusei[x][1].equals(nyuryoku)){
            System.out.println("ログイン成功");
            return;
        }
        System.out.println("不正アクセス");
    }
}
