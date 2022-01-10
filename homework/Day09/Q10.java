package 두잇자바.homework.Day09;
//과제10) 키보드 입력으로 오늘 이후 부터 7일 이내의 날짜를 5개 입력받아 

// Airplane 객체의 출발날짜로 입력한 Arraylist를 만드시오. 도착날짜는 출발날짜 + 1
// 3명의 Human 객체 Arraylist를 만들고, 무작위로 speed(7 이내)와 direction(국내선, 국제선 중에 1개의 값)을 세팅하시오.
// 현재 시간을 기준으로 비행기편과 그 비행기편의 날짜가 사용가능한 Human의 정보를 출력하시오. speed는 1 = 1일로 가정
// + 비행기편은 1년 -> 3일로 변경
// + 입력은 Scanner가 아닌 자동생성코드도 괜찮음

import java.util.ArrayList;
import java.util.Date;

// Airplane 객체의 출발날짜 Arraylist = 오늘 이후 7일 이내의 날짜 5개
// Airplane 객체의 도착날짜 Arraylist = 각 출발날짜 + 1
// Human 객체 Arraylist = 3개
// Human 객체 = speed(7이내, 일) 랜덤 = 14행의 7일 이내와 동일., direction(국내/국제) 세팅
// 현재시간을 기준, 비행기편과 해당 비행기편 사용가능한 Human의 정보를 출력
class Airplane {
    Date today = new Date();
    long day = 1000 * 60 * 60 * 24;
    long week = day * 7;
    long rand = (long) (Math.random() * week);
    Date dep = new Date(today.getTime() + rand);
    Date arr = new Date(dep.getTime() + day);
}

class Human {
    int speed = (int) (Math.random() * 8);
    String[] rand = { "국내선", "국제선" };
    int i = (int) (Math.random() * 2);
    String direction;
    String name;
    long num = (long) (Math.random() * 1000*60*60*24*speed);
    Date today = new Date();
    Date dep = new Date(today.getTime() + num);

    Human(String name) {
        this.name = name;
        this.direction = rand[i];
        System.out.println("여행객 정보");
        System.out.println("이름: "+name);
        System.out.println("노선: "+direction);
        System.out.println("기한: "+dep+"까지 가능");
    }
}

public class Q10{
    
    public static void main(String[] args) {
        ArrayList<Date> d = new ArrayList<>();
        ArrayList<Date> a = new ArrayList<>();

        Airplane a_air = new Airplane();
        d.add(a_air.dep);
        a.add(a_air.arr);
        Airplane b_air = new Airplane();
        d.add(b_air.dep);
        a.add(b_air.arr);
        Airplane c_air = new Airplane();
        d.add(c_air.dep);
        a.add(c_air.arr);
        Airplane d_air = new Airplane();
        d.add(d_air.dep);
        a.add(d_air.arr);
        Airplane e_air = new Airplane();
        d.add(e_air.dep);
        a.add(e_air.arr);

        Human a_Human = new Human("민수");
        System.out.println("---------------------------");
        Human b_Human = new Human("철수");
        System.out.println("---------------------------");
        Human c_Human = new Human("영희");
        System.out.println("---------------------------");

        ArrayList<Human> tourist = new ArrayList<Human>();
        tourist.add(a_Human);
        tourist.add(b_Human);
        tourist.add(c_Human);

        for(int i=0; i<5; i++){
            System.out.println("비행기 출발편: "+d.get(i));
            System.out.println("비행기 도착편: "+a.get(i));
            System.out.println("-사용 가능한 사람-");
            for(int j=0; j<3; j++){
                if(a.get(i).getTime()<=tourist.get(j).dep.getTime()){
                    System.out.println("이름: "+tourist.get(j).name);
                    System.out.println("노선: "+tourist.get(j).direction);
                    System.out.println("기한: "+tourist.get(j).dep);
                }
            }
            System.out.println("-------------끝-------------");
        }
    }
}
