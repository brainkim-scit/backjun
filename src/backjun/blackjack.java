package backjun;

import java.util.Scanner;

public class blackjack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int aim = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		int result = black(array,size,aim);
		System.out.println(result);
	}
	public static int black(int[] array, int size, int aim) {
		int max = 0;
		for(int i=0; i<size-2; i++) {
			if(array[i] > aim) continue;
			for(int j=i+1; j<size-1; j++) {
				if(array[i]+array[j] > aim) continue;
				for(int k=j+1; k<size; k++) {
					int temp = array[i]+array[j]+array[k];
					if(temp > aim) continue;
					else if(temp == aim) return temp;
					else {
						max = temp > max ? temp : max;
					}
				}
			}
		}
		return max;
	}
}
