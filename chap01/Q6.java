package 두잇자바.chap01;
import java.util.Scanner;
//1-4에서 while문이 종료될때마다 i = n+1임을 확인하세요.

public class Q6 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("1부터 N까지의 합을 구합니다.");
        System.out.print("n의 값: ");

        int n = stdin.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n){
            sum += i;
            System.out.printf("%d회 반복 결과 i = %d, sum = %d 입니다.\n",i,i,sum);
            i++;
        }
        System.out.printf("While문이 끝난 i = %d 입니다.\n",i);
        System.out.printf("1부터 %d까지의 합은 %d입니다.",n,sum);
    stdin.close();
    }
    
}
