package 두잇자바.chap02;
import java.util.Scanner;
import java.util.Arrays;
//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.

public class Q3 {
    //메서드 작성
    static int sumOf(int[] a){

        int sum=0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("배열의 모든 요소의 합은 "+sum+"입니다.");
        return sum;
    }

    //배열 a생성과 출력
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("배열 a의 길이를 입력해라.> ");
        int num = stdin.nextInt();
        int[] x = new int[num];

        //배열 a생성
        for (int i = 0; i < num; i++) {
            System.out.print("a["+i+"] : ");
            x[i] = stdin.nextInt();
        }

        //배열a 출력
        System.out.println(Arrays.toString(x));
        //메소드 실행
        sumOf(x);
        
        stdin.close();
    }
}
