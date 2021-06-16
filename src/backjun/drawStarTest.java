package backjun;

import java.util.Scanner;

public class drawStarTest {
	
	static char[][] list;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		list = new char[size][size];
		star(0,0,size,false);
		
//		for(int i=0; i<size; i++) {
//			for(int j=0; j<size; j++) {
//				System.out.print(list[i][j]);
//			}
//			System.out.println();
//		}
//		
	}
	
	public static void star(int x, int y, int size, boolean check) {
		
		if(check) {
			for(int i=x; i<x+size; i++) {
				for(int j=y; j<y+size; j++) {
					list[i][j] = ' ';
				}
			}
			return;
		}
		
		if(size == 1) {
			list[x][y] = '*';
			return;
		}
		
		int temp = size/3;
		int count = 0;
		for(int i=x; i<x+size; i+=temp) {
			for(int j=y; j<y+size; j+=temp) {
				count++;
				if(count == 5) {
					star(i,j,temp,true);
				}else {
					star(i,j,temp,false);
				}
			}
		}
	}
	
}
