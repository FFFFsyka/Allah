import java.util.Arrays;
import java.util.Scanner;

public class ggg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n - i - 1; j++){
                count++;
                if(a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                    cnt++;
                }
            }
            if(cnt == 0) break;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}
