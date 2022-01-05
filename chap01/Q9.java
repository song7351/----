package 두잇자바.chap01;
import java.util.Scanner;
// 두 정수 a,b를 포함한 사잇값의 합을 구하시오.

public class Q9 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("a의 값을 입력해주세요.> ");
        int a = stdin.nextInt();
        System.out.print("b의 값을 입력해주세요.> ");
        int b = stdin.nextInt();

        System.out.println("a: "+a+" b: "+b);

        int sum_a = a*(a+1)/2;
        int sum_b = b*(b+1)/2;
        int sum;

        if(sum_a >= sum_b){
            sum = sum_a - sum_b;
            System.out.println("b에서 a까지의 합은 "+sum+"입니다.");
        }
        else{
            sum = sum_b - sum_a;
            System.out.println("a에서 b까지의 합은 "+sum+"입니다.");
        }

        stdin.close();

    }
    
}
