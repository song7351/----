package 두잇자바.chap01;
import java.util.Scanner;
//가우스 덧셈방식 생산해라

public class Q8 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("1부터 N까지의 합을 구합니다.");
        System.out.print("N의 값: ");

        int n = stdin.nextInt();
        int sum = (n+1)*n/2;

        System.out.printf("1부터 %d까지의 합은 %d입니다.",n,sum);
        stdin.close();
    }
    
}
