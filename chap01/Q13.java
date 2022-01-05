package 두잇자바.chap01;
//Q12(곱셈표)에서 덧셈표로 바꿔라.

public class Q13 {
    public static void main(String[] args) {

        System.out.print("  |");
        for(int i=1; i<=9; i++){
            System.out.printf("%3d", i);
        }

        System.out.println("\n--+----------------------------");

        for(int i=1; i<=9; i++){
            System.out.printf("%2d|", i);
            for(int j=1; j<=9; j++){
                System.out.printf("%3d", i+j);
            }
            System.out.println();
        }

    }    
}
