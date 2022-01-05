package 두잇자바.chap01;
import java.util.Scanner;
//양의 정수의 자릿수를 출력하시오.

public class Q11 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요.> ");
        int a = stdin.nextInt();
        int cnt = 1;

        while(a/10 != 0){
            a = a/10;
            cnt++;
        }
        
        System.out.printf("그 수는 '%d'자리입니다.",cnt);
        stdin.close();

    }
}
