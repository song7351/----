package 두잇자바.chap01;
import java.util.Scanner;
//특정 답안을 만드시오.

public class Q10 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = stdin.nextInt();
        System.out.print("b의 값 : ");
        int b = stdin.nextInt();   

        if(b<a){
            do{
                System.out.println("a보다 큰 값을 입력하세요!");
                System.out.print("b의 값 : ");
                b = stdin.nextInt();   
            }while(b<a);
        }

        System.out.printf("b - a는 %d입니다.",b-a);
        stdin.close();
    }
}
