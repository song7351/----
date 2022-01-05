package 두잇자바.chap02;
//구성 자료형이 int인 배열(구성 요솟수는 5 : 배열 초기자에 의해 생성)

public class Trainnig_2_2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        for(int i=0; i<a.length; i++){
            System.out.printf("a[%d] = %d\n",i,a[i]);
        }

    }
}
