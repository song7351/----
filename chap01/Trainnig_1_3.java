package 두잇자바.chap01;
import java.util.Scanner;
//입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.

public class Trainnig_1_3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int n = stdin.nextInt();

        if(n>0){
            System.out.println("이 수는 양수입니다.");
        }
        if(n<0){
            System.out.println("이 수는 음수입니다.");
        }
        else{
            System.out.println("이 수는 0입니다.");
        }
        stdin.close();
    }
}
