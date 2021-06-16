package backjun;

import java.util.Scanner;

public class nQueen {
    public static int N;
    public static int[] arr;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];

        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int n) {
        if(n == N){
            count++;
            return;
        }

        for(int i=0; i<N; i++){
            arr[n] = i;

            if(possible(n)){
                dfs(n+1);
            }
        }
    }

    public static boolean possible(int col){
        for(int i=0; i<col; i++){
            if(arr[col] == arr[i]){
                return false;
            }

            else if(Math.abs(col-i) == Math.abs(arr[col]- arr[i])){
                return false;
            }
        }
        return true;
    }
}
