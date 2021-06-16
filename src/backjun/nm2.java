package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class nm2 {

    //    public static boolean[] visit;
    public static int[] array;
    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        array = new int[m];

        dfs(1,0);
    }
    public static void dfs(int at, int depth){
        if(depth == m){
            for(int val : array){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=at; i<=n; i++){
            array[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}
