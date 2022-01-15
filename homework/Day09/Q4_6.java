package 두잇자바.homework.Day09;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
// 과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
// main에서 객체를 생성후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)
// 과제5-1) 출발지와 도착지를 멤버변수로 만들고, 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
// 과제5-2) 출발날짜와 도착날짜를 getter로 만들고, 02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화)
// 국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산
// 국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르
// 과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는
// 국제선에 따라서 Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)


//추상클래스
abstract class Airplane{
    Calendar dDate; //출발날짜
    Calendar aDate; //도착날짜
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
    String arrivals;    //출발지
    String departures;  //도착지
    String isDomestic; //국내선이다.
    String[] domestic = {"김포","인천","김해","제주","울산"};
    String[] international = {"도쿄","상하이","홍콩","싱가폴","쿠알라룸푸르"};

    public Airplane(){
        System.out.println("국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산");
        System.out.println("국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르");
    }
    public void getdDate() {
        String depDate = simpleDateFormat.format(this.dDate.getTime());
        System.out.println("출발날짜: "+depDate);
    }
    public void setdDate(int year,int month,int day) {
        dDate = Calendar.getInstance();
        dDate.set(year,month-1,day);
    }
    public void getaDate() {
        String arrDate = simpleDateFormat.format(this.aDate.getTime());
        System.out.println("도착날짜: "+arrDate);
    }
    public void setaDate(int year,int month,int day) {
        aDate = Calendar.getInstance();
        aDate.set(year,month-1,day);
    }
    //과제 5-1)추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
    abstract String check();
    // 과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오.
    abstract String flight();
}

class Travel extends Airplane{
   
    String check() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("국내선 입니까? (yes/no)> ");
            String ans = input.nextLine();
            if (ans.equals("yes")==true) {
                this.isDomestic = "국내선";
                System.out.println(this.isDomestic);
                break;
            } 
            else if (ans.equals("no")==true) {
                this.isDomestic = "국제선";
                System.out.println(this.isDomestic);
                break;
            } 
            else {
                System.out.println("입력 오류입니다.");
                System.out.println("다시 입력하세요.");
            }
        } while (true);
        return this.isDomestic;
    }

    String flight(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("목적지를 입력하세요.> ");
            departures = input.nextLine();
            if (Arrays.asList(domestic).contains(departures) == true) {
                System.out.println("국내선입니다.");
                isDomestic = "국내선";
                break;
            } else if (Arrays.asList(international).contains(departures) == true) {
                System.out.println("국제선입니다.");
                isDomestic = "국제선";
                break;
            } else {
                System.out.println("입력 오류입니다.");
            }
        } while (true);
        input.close();
        return isDomestic;
    }

    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.setdDate(2022, 2, 1);
        travel.getdDate();
        travel.setaDate(2022, 2, 2);
        travel.getaDate();
        travel.check();
        travel.flight();
    }
    
}