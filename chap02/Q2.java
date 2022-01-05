package 두잇자바.chap02;
import java.util.Scanner;
import java.util.Arrays;
//2_6에서 역순으로 만드는 과정을 출력해라.

public class Q2 {

    // 배열 a[a1]과 a[a2]를 바꿈
    static void swap(int[] a, int a1, int a2) {
        System.out.println("a["+a1+"]과(와) a["+a2+"]를 교환합니다.");
        int t = a[a1];
        a[a1] = a[a2];
        a[a2] = t;
    }

    // 배열 a[]의 요소를 역순으로 정렬
    // 정확히는 양끝을 교환하는 방법
    // ex)lenght = 5일경우, (0-4,1-3) 교환해서 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("\n"+(i+1)+"회 시행");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
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

        System.out.println("\n요소를 역순으로 정리하고 있습니다.");
        reverse(x);

        System.out.println("\n요소를 역순으로 정리했습니다.");
        System.out.println(Arrays.toString(x));
        stdin.close();
    }

}
