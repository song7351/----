package 두잇자바.chap01;
import java.util.Scanner;
//(별찍기 피라미드(n행 = (n-1)*2 + 1) 메서드 전부 만들기)

public class Q16 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do{
            System.out.print("몇 단 피라미드입니까? : ");
            n = stdin.nextInt();
        }while(n<0);

        spira(n);
    
        stdin.close();
    }

    static void spira(int n){
        int a = (n-1)*2+1; //최종 *의 길이.
        int m = a/2 + 1;   //길이의 중간값.

        //오른쪽-아래 삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                if(j<=m){
                    if (i+j<=m) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                //왼쪽-아래 삼각형 
                else {
                    if (j-i>=m) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }

        
    }
}
