package backjun;

import java.util.Scanner;

public class bt6 {
    public static int[] number;
    public static int[] func = new int[4];
    public static int N;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        number = new int[N];

        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            func[i] = sc.nextInt();
        }

        dfs(number[0], 1);
        System.out.println(max + ", " + min);
    }

    public static void dfs(int cal, int depth) {
        if (depth == N) {
            max = Math.max(max, cal);
            min = Math.min(min, cal);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (func[i] > 0) {
                func[i]--;
                if (i == 0) {
                    dfs(cal + number[depth], depth+1);
                } else if (i == 1) {
                    dfs(cal - number[depth], depth+1);
                } else if (i == 2) {
                    dfs(cal * number[depth], depth+1);
                } else if (i == 3) {
                    dfs(cal / number[depth], depth+1);
                }
                func[i]++;
            }
        }
    }
}
