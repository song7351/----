package 두잇자바.homework.Day09;
//과제7) ArrayList에 현재시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(기본)
//과제8) ArrayList에 내일시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(심화)
//과제9) ArrayList에 1년 이내의 날짜를 random하게 만들어서 입력하고, 
//현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.(심화)

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Q7_9 {

    //과제7)
    public static void main(String[] args) {
        ArrayList<Date> a = new ArrayList<Date>();
        Date today = new Date();
        a.add(today);
        System.out.println(a);
    //과제8)
        long oneday = 1000*60*60*24;
        Date tomorrow = new Date(today.getTime()+oneday);
        a.add(tomorrow);
        System.out.println(a);
    //과제9) ArrayList에 1년 이내의 날짜를 random하게 만들어서 입력하고,
        //1년이내의 랜덤 초(sec) = 1년 = 365일 = 365일*24시간 =365일*24시간*60분 =
        //365일*24시간*60분*60초
        long rand = (long)(Math.random()*1000*60*60*24*365);
        Date future = new Date(today.getTime()+rand);
        a.add(future);
        System.out.println(a);
    //과제9) 현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.(심화)
        for (int i=0; i<a.size(); i++) {
            System.out.println("현재시간: "+today);
            long diff = a.get(i).getTime()-today.getTime();
            long sec = diff/1000;
            long day = sec/(24*60*60);
            System.out.println("현재시간과의 차이는 "+day+"일 입니다.");
        }
        
    }
}
