package 두잇자바.chap02;

import java.util.Arrays;
import java.util.Scanner;
//배열 요소에 값을 읽어 역순으로 정력합니다.

public class Trainnig_2_6 {

    // 배열 a[a1]과 a[a2]를 바꿈
    static void swap(int[] a, int a1, int a2) {
        int t = a[a1];
        a[a1] = a[a2];
        a[a2] = t;
    }

    // 배열 a[]의 요소를 역순으로 정렬
    // 정확히는 양끝을 교환하는 방법
    // ex)lenght = 5일경우, (0-4,1-3) 교환해서 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("배열 길이 : ");
        int num = stdin.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdin.nextInt();
        }
        System.out.println("요소를 정순으로 정리했습니다.");
        System.out.println(Arrays.toString(x));
        reverse(x);

        System.out.println("요소를 역순으로 정리했습니다.");
        System.out.println(Arrays.toString(x));
        stdin.close();
    }

}
