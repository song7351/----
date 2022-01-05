package 두잇자바.chap01;
import java.util.Scanner;
//1~n의 합을 구합니다.(양수만 입력)

public class Trainnig_1_6 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

//n이 양수가 나올때까지 do{}를 반복하시오.
        do{
            System.out.print("n의 값: ");
            n = stdin.nextInt();
        }while(n<=0);

        int sum = 0;

        for(int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
        stdin.close();

    }
}
