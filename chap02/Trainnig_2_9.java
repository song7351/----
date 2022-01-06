package 두잇자바.chap02;
//1,000 이하의 소수를 열거(ver.1)

public class Trainnig_2_9 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) { //나누어 떨어지면 소수가 아님.
                    break;        //그러니 뒤의 숫자는 이어서할 필요가 없음. 16행으로 이동.
                }
            } // 12행의 if문에서 소수인걸 확인했을때 결국 i값은 n이됨(i++)
            if (n == i) {   //그결과 소수(자기 자신으로만 나눌수있기에 n==i일때)
                System.out.println(n);  //소수를 출력
            }
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}