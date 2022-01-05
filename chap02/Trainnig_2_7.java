package 두잇자바.chap02;
import java.util.Scanner;
//두 배열이 같은가? (순서까지)

public class Trainnig_2_7 {
    //(메소드)두 배열의 모든 요소가 같은가? (순서까지)
    static boolean equals(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        //배열 a
        System.out.print("a배열의 길이 입력> ");
        int num_a = stdin.nextInt(); 

        int[] a = new int[num_a];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = stdin.nextInt();
        }

        //배열 b
        System.out.print("b배열의 길이 입력> ");
        int num_b = stdin.nextInt(); 

        int[] b = new int[num_b];
        for (int i = 0; i < b.length; i++) {
            System.out.print("b["+i+"] : ");
            b[i] = stdin.nextInt();
        }

        System.out.println("배열 a와 배열 b는 "+
        (equals(a, b) ? "같습니다." : "다릅니다."));

        stdin.close();
    }
}
