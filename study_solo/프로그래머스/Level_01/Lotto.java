package 두잇자바.study_solo.프로그래머스.Level_01;
//https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
//1~45까지 숫자중 6개를 찍는다.

import java.util.Arrays;

class lotto{
    public static void main(String[] args) {
        int[] WIN_NUM = new int[6]; //번호 6개가 들어간다.

        for (int i = 0; i < WIN_NUM.length; i++) {
            WIN_NUM[i] = (int)(Math.random()*45)+1;  //1에서 45까지 랜덤
            for (int j = 0; j < i; j++) {
                if(WIN_NUM[i] == WIN_NUM[j]){        //만약 i번째값이 이전과 같다면
                    i--;                             //i의 값을 1만큼은 줄여서
                    break;                           //10행을 다시해라.
                }
            }
        }
        System.out.println(Arrays.toString(WIN_NUM)); //정답번호 6개가 들어가있다.
        
        //구매자의 알아볼수없게 변한 숫자를 0으로 표시한다.
        int[] Lottos = new int[6]; //번호 6개가 들어간다.
        int zero = 0;              //번호 0의 개수
        for (int i = 0; i < Lottos.length; i++) {
            Lottos[i] = (int)(Math.random()*46);  //0에서 45까지 랜덤
            for (int j = 0; j < i; j++) {
                if (Lottos[i] == 0) {             //번호가 0이라면 
                    zero += 1;                       //0의 개수
                    continue;                     //0을 입력하고 27행으로 넘어가라
                }else if(Lottos[i] == Lottos[j]){    //만약 i번째값이 이전과 같다면
                    i--;                             //i의 값을 1만큼은 줄여서
                    break;                           //27행을 다시해라.
                }
            }
        }
        System.out.println(Arrays.toString(Lottos));
        System.out.println(zero);
        
        int MIN = 7;
        for (int i = 0; i < WIN_NUM.length; i++) {
            for (int j = 0; j < Lottos.length; j++) {
                if(WIN_NUM[i] == Lottos[j]){
                    MIN--;
                }
            }
        }
        int MAX = MIN - zero;
        if(MIN>5){
            MIN = 6;
        }
        if(MAX>5){
            MAX = 6;
        }

        System.out.println("["+MAX+", "+MIN+"]");
    }
}
