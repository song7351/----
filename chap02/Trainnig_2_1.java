package 두잇자바.chap02;
//구성 요소의 자료형이 int형인 배열(구성 요솟수는 5 : new에 의해 본체를 생성)
//배열 최초 생성시, 기본값은 0

public class Trainnig_2_1 {
    public static void main(String[] args) {
        int[] a= new int[5]; //배열선언

        a[1] = 37; //a[1]에 37을 대입
        a[2] = 51; //a[2]에 51을 대입
        a[4] = a[1]*2; //a[1]에 a[1]*2을 대입

        for(int i=0; i<a.length; i++){
            System.out.printf("a[%d] = %d\n",i,a[i]);
        }
    }    
}
