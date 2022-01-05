package 두잇자바.chap02;
import java.util.Arrays;
import java.util.Scanner;
//배열 b의 모든 요소를 배열 a에 역순서 복사하는 메서드 작성


public class Q5 {
    //(메소드)생성
    static void copy(int[] a, int[] b){
        int num = a.length < b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[b.length-i-1];
        }
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

        System.out.println("a[]: "+Arrays.toString(a));
        System.out.println("b[]: "+Arrays.toString(b));
        System.out.println("\n메소드 시행");
        //메소드 실행
        copy(a, b);
        System.out.println("a[]: "+Arrays.toString(a));
        stdin.close();
    }
}