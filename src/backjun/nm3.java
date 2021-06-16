package backjun;

import java.util.Scanner;

public class nm3 {

    public static int[] array;
    public static int m;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        array = new int[m];

        dfs(0);
    }
    public static void dfs(int depth){
        if(depth == m){
            for(int val : array){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            array[depth] = i+1;
            dfs(depth+1);
        }
    }
}
