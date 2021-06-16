package backjun;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class howBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] weight = new int[count];
        int[] height = new int[count];
        int[] result = new int[count];

        for(int i=0; i<count; i++){
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
            result[i] = 1;
        }

        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                if(weight[i]<weight[j] && height[i]<height[j]){
                    result[i] = result[i]+1;
                }
            }
        }
        String s = "";
        for(int i : result){
            s += Integer.toString(i);
        }
        System.out.println(String.join(" ",s.split("")));
    }
}
