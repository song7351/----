package 두잇자바.homework.Day09;
//인터페이스
//인터페이스 상속받은 클래스는 반드시 인터페이스에서 정의된 모든 추상메서드를 구현(오버라이딩)시켜야함.

//과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
//과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. (36행)

interface Runnable {    //메소드 바디는 없고 선언만 추상메소드로 100%이루어진것 = 인터페이스
    void name(String name); //이름을 정하는 메소드
    void age(int age);  //나이를 정하는 메소드
}

interface Speak{
    void silent();
    void loud();
}

//인터페이스 구현 클래스(1)
class Human implements Runnable{    
    public void name(String name){
        System.out.println("이름: "+name);
    }
    
    public void age(int age){
        System.out.println("나이: "+age);
    }
    
    //출력 테스트
    public static void main(String[] args) {
        Human apple = new Human();
        apple.name("사과");
        apple.age(10);
    }
}

//과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오.
//인터페이스 구현 클래스(2)
class Person implements Runnable,Speak{
        
    public void name(String name){
        System.out.println(name+"맛있다.");
    }

    public void age(String age){
        System.out.println(age+"이다.");
    }

    public void age(int age){
        System.out.println(age+"살이다.");
    }

    public void silent(){
        System.out.println("쉿!");
    }
    public void loud(){
        System.out.println("야!");
    }
    
    //출력 테스트
    public static void main(String[] args) {
        Person potato = new Person();
        potato.name("감자");
        potato.age("열살");
        potato.age(10);
        potato.silent();
        potato.loud();
    }
}
