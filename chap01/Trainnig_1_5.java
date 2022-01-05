package 두잇자바.chap01;
//1~n까지의 합을 구해라

import java.util.Scanner;

public class Trainnig_1_5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("1부터 N까지의 합을 구합니다.");
        System.out.print("n의 값: ");

        int n = stdin.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
        stdin.close();
        System.out.printf("1부터 %d까지의 합은 %d입니다.",n,sum);
    }
    
}