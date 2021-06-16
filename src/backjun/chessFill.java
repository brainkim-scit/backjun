package backjun;

import java.util.Scanner;

public class chessFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.nextLine();
        boolean[][] board = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < y; j++) {
                if (s.charAt(j) == 'W') board[i][j] = true;
                else board[i][j] = false;
            }
        }
        int countX = 0;
        int countY = 0;
        int min = 64;
        while (true) {
            if (countY + 8 > y) {
                countY = 0;
                countX++;
            }
            if (countX + 8 > x) break;
            boolean target = board[countX][countY];
            int temp = 0;
            for (int i = countX; i < countX + 8; i++) {
                for (int j = countY; j < countY + 8; j++) {
                    if (target != board[i][j]) {
                        temp++;
                    }
                    target = !target;
                }
                target = !target;
            }
            countY++;
            if (min > temp) min = temp;
        }
        System.out.println(min);
    }
}
