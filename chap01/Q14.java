package 두잇자바.chap01;
import java.util.Scanner;
//입력한 정수 크기의 *로 사각형 만들기.

public class Q14 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");
        int num = stdin.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        stdin.close();

    }    
}
