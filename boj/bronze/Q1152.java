package 두잇자바.boj.bronze;
// https://www.acmicpc.net/problem/1152

import java.util.Scanner;

// (문제)
// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
// 이를 구하는 프로그램을 작성하시오. 
// 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
// 입력: The Curious Case of Benjamin Button
// 결과: 6

public class Q1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String a = str.trim();
        if (a.isEmpty() != true) {
            String ans[] = a.split(" ");
            System.out.println(ans.length);
        } else {
            System.out.println(0);
        }
        s.close();
    }
}
