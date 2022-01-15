package 두잇자바.boj.bronze;
//https://www.acmicpc.net/problem/2675

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int test = stdin.nextInt();
        for (int i = 0; i < test; i++) {
            int num = stdin.nextInt();
            String text = stdin.next();
            
            for (int j = 0; j < text.length(); j++) {
                for (int j2 = 0; j2 < num; j2++) {
                    System.out.print(text.charAt(j));
                }
            }
            System.out.println();
        }
        stdin.close();
    }
}
