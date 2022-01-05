package 두잇자바.chap02;
import java.util.Scanner;
import java.util.Random;
// 2_5번
// 배열 요소의 최댓값을 나타냅니다.(값을 난수로 생성)
// 사람의 수를 난수로 구하라.

public class Q1 {
    
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
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람의 수 : ");
        int num = 1 + rand.nextInt(9); // rand.nextInt(9) = 0~9까지의 난수.
        System.out.println(num);

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            height[i] = 100 + rand.nextInt(90); //rand.nextInt(90) = 0~89까지의 난수.
            System.out.printf("height[%d] : %d\n",i,height[i]);
            
        }
        stdin.close();
        System.out.println("최댓값은 "+maxArr(height)+"입니다.");
    }
}
