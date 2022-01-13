package 두잇자바.study_solo.프로그래머스.Level_01;
//https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
//정답!

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 7;
        int max = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(win_nums[i] == lottos[j]){
                    min -= 1;
                }
            }
            if(lottos[i] == 0){
                max += 1;
            }
        }
        max = min - max;
        if(min>5){
            min = 6;
        }
        if(max>5){
            max = 6;
        }
        int[] answer = {max,min};
        return answer;
    }
}

