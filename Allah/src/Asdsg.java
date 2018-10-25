import java.util.ArrayList;
import java.util.Scanner;

public class Asdsg
 {

    public static void main(String[] args)
    {  Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> as = new ArrayList<>();
        ArrayList<Integer> bs = new ArrayList<>();
        for(int i=1;i<=a; i++){
            if(a % i==0) {
                as.add(i);
            }
        }
        for(int j=1;j<=b;j++){
            if((b % j == 0)&&(!as.contains(j))){
                as.add(j);

            }

        }
        System.out.println(as);
        System.out.println(as.size());






    }
}