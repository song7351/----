package 두잇자바.chap02;
//1,000 이하의 소수를 열거(버전3)

public class Trainnig_2_11 {
    public static void main(String[] args) {
        int counter = 0; // 곱셈과 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // prime[0] = 2, ptr=1
        prime[ptr++] = 3; // prime[1] = 3 ptr=2

        for (int n = 5; n < 1000; n += 2) { // 4는 짝수라 제외하고 5부터 시작
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) { // 나누어 떨어지면 소수가 아님.
                    flag = true;
                    break;
                }
            }
            if (!flag) { // 17행에서 짝수라면, flag=true이고 22행에서 false가됨. (소수라면 반대)
                prime[ptr++] = n; // 소수라면 배열에 순차적 입력
                counter++;
            }
        }
        for (int i = 0; i < ptr; i++) { // ptr은 결국 소수가 들어간 배열의 길이이자, 소수의 개수
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }

}
