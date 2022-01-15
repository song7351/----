package 두잇자바.boj.bronze;
// https://www.acmicpc.net/problem/2562

import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] num = new int[9];
        for (int i = 0; i < num.length; i++) {
            int input = stdin.nextInt();
            num[i] = input;
        }
        
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > max){
                max = num[i];
                max_index = i;
            }
        }
        System.out.println(max);
        System.out.println(max_index+1);
        stdin.close();
    }
}
