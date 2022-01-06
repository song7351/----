package 두잇자바.chap02;
//1,000이하의 소수를 열거(ver.2)

public class Trainnig_2_10 {
    public static void main(String[] args) {
        int counter = 0;            // 나눗셈 횟수
        int ptr = 0;                // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 2는 최소의 소수임.
        // prime[0] = 2;
        // ptr = 1;

        for (int n = 3; n <= 1000; n += 2) {    // 대상은 홀수만, 왜냐? 짝수는 소수가 불가능(2제외)
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) {        // 나누어떨어지면 소수가 아님
                    break;                      // 22행으로 탈출!
                }
            }
            if (ptr == i) {       // 최초: ptr=i=1             //결국 마지막 본인을 포함한다면(ptr==i)
                prime[ptr++] = n; // 최초: prime[1]=3, ptr=2;  //해당 n을 배열에 포함.
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
