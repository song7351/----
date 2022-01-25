package 두잇자바.chap02;
//실습 2-13에서

//메서드 dayOfYear를 변수 i와 days없이 구현하세요. while문을 사용하세요.

import java.util.Scanner;

public class Q8 {

    // 각 달의 일수
    static int[][] mdays = {
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년[0][?]
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년[1][?]
    };

    // int year은 윤년인가? 윤년=1 평년=0
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 경과 일 수
    static int dayOfYear(int y, int m, int d) {
        while(m>1){
            d += mdays[isLeap(y)][m - 2];
            m--;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일 수를 구합니다.");

        do {
            System.out.print("년: ");
            int year = stdin.nextInt();
            System.out.print("월: ");
            int month = stdin.nextInt();
            System.out.print("일: ");
            int day = stdin.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.println("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = stdin.nextInt();
        } while (retry == 1);
        stdin.close();
    }
}