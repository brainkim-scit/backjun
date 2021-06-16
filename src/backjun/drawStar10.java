package backjun;

import java.util.Scanner;

public class drawStar10 {
	
	static char[][] array;
	static int size;
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        array = new char[size][size];
        
        drawStar(0,0,size,false);
        
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
    }
    
    public static void drawStar(int x, int y, int N, boolean blank){
    	
    	if(blank) {
    		for(int i=x; i<x+N; i++) {
    			for(int j=y; j<y+N;j++) {
    				array[x][y] = ' ';
    			}
    		}
    		return;
    	}
    	
    	if(N == 1) {
    		array[x][y] = '*';
    		return;
    	}
        
    	
    	int temp = N/3;
    	int count = 0;
    	
    	for(int i=x; i<x+N; i+=temp) {
    		for(int j=y; j<y+N; j+=temp) {
    			count++;
    			if(count == 5) {
    				drawStar(i, j, temp, true);
    			}else {
    				drawStar(i, j, temp, false);
    			}
    		}
    	}
    }
}
