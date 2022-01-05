package 두잇자바.chap01;
import java.util.Scanner;
//1_5를 참고하여 n이 7이면, '1+2+~+7=28'으로 출력하게 하라.

public class Q7 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("1부터 N까지의 합을 구합니다.");
        System.out.print("N의 값: ");

        int n = stdin.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
            if(i != n){
                System.out.printf("%d + ",i);
            }
            else{
                System.out.printf("%d = %d",i,sum);
            }
            
        }
        stdin.close();
        System.out.printf("\n1부터 %d까지의 합은 %d입니다.",n,sum);
    }
    
}