package 두잇자바.chap02;
//생성자와 메서드를 정의하라

// 2_13참고

//생성자(주어진 날짜로 설정)
// YMD(int y, int m, int d)
// n일 뒤의 날짜를 반환
// YMD after(int n)
// n일 앞의 날짜를 반환
// YMD before(int n)
// class YMD{
//     int y;  //년
//     int m;  //월(1~12)
//     int d;  //일(1~31)
// }

public class Q11 {

    static class YMD {
        int y; // 년
        int m; // 월(1~12)
        int d; // 일(1~31)

        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }
    }

    // 각 달의 일수
    static int[][] mdays = {
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년[0][?]
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년[1][?]
    };

    // int year은 윤년인가? 윤년=1 평년=0
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // n일 뒤의 날짜를 반환
    YMD after(int n) {
        

    }

    // n일 앞의 날짜를 반환
    YMD before(int n) {

    }

    public static void main(String[] args) {
        
    }

}
