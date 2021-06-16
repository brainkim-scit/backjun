package backjun;

import java.util.Scanner;

public class hap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for(int i=N-Integer.toString(N).length()*9; i<N; i++){
            int temp = i;
            int sum = 0;

            while(temp != 0){
                sum += temp % 10;
                temp /= 10;
            }

            if(i+sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
