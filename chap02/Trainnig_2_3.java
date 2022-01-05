package 두잇자바.chap02;
//배열을 복제합니다. (clone)

import java.util.Arrays;

public class Trainnig_2_3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();
        System.out.println("a[] = "+Arrays.toString(a));
        System.out.println("b[] = "+Arrays.toString(b));

        b[3] = 0;
        System.out.println("b[3] = 0 입력시, ");
        System.out.println("b[] = "+Arrays.toString(b));

    }
    
}
