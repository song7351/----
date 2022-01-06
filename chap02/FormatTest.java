package 두잇자바.chap02;

public class FormatTest {
    public static void main(String[] args) {
        
        System.out.printf(String.format("%%2d | %%%dd\n", 3),3,4);
        //String.format("%%2d | %%%dd\n", 3)
        // %%2d의 경우, %% = %"%"으로 변환, 결과 "%2d"
        // %%%dd의 경우, %% = %"%"으로 변환,
        // "%"%dd으로 변환, %d = 3, 결과 "%3d"
        //최종 = System.out.printf("%2d | %3d\n",3,4);
    
        
    }
    
}
