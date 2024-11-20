package lecture2;

public class Keisan {
    public int goukei(int[] num){
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        return sum;
    }

    public void hantei(int x){
        if(x>=100){
            System.out.println("great!!");
        }else if(x>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
