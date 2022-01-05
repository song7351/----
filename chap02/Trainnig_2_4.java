package 두잇자바.chap02;
import java.util.Scanner;
// 배열 요소의 최댓값을 나타냅니다.(값을 입력받음)
public class Trainnig_2_4 {
    
    //배열의 최댓값을 구하는 메서드
    static int maxArr(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    //배열을 입력하고 요소의 최댓값을 출력
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람의 수 : ");
        int num = stdin.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            System.out.printf("height[%d] : ",i);
            height[i] = stdin.nextInt();
        }
        stdin.close();
        System.out.println("최댓값은 "+maxArr(height)+"입니다.");
    }
}
