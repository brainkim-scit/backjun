package backjun;

import java.util.Scanner;

public class nm {

    public static boolean[] visit;
    public static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        visit = new boolean[n];
        array = new int[m];

        dfs(n,m,0);
    }
    public static void dfs(int n, int m, int depth){
        if(depth == m){
            for(int val : array){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                array[depth] = i+1;
                dfs(n,m,depth+1);
                visit[i]=false;
            }
        }
    }
}
