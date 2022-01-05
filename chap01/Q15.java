package 두잇자바.chap01;
import java.util.Scanner;
//(별찍기 삼각형 종류별로 메서드 전부 만들기)

public class Q15 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do{
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdin.nextInt();
        }while(n<0);

        triLD(n);
        triLU(n);
        triRD(n);
        triRU(n);
    
        stdin.close();
    }

    // 왼쪽-아래
    static void triLD(int n) {
        System.out.println("왼쪽-아래 출력합니다.");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    // 왼쪽-위
    static void triLU(int n) {
        System.out.println("왼쪽-위 출력합니다.");
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    // 오른쪽-아래
    static void triRD(int n) {
        System.out.println("오른쪽-아래 삼각형 출력합니다.");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 오른쪽-위
    static void triRU(int n) {
        System.out.println("오른쪽-위 출력합니다.");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j - i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
