package 두잇자바.study_solo;
//상속 예시
// 자식 extends 부보
//부모 클래스
class Person{
    String name;
    int age;
    //부모생성자
    public Person(String name, int age){
        System.out.println("Person 부모 먼저 실행");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toStriing(){
        return name + ":" + age;
    }
}

class Emplyee extends Person{
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
    // public String toStriing(){
    //     return this.getName() + ":" + this.getAge()+ ":" + dept;
    // }   //this.getName() 과 this.getAge()는 부모꺼.

    public String toStriing(){
        return super.toStriing()+ ":" + dept; //39행과 동일한 의미
    }   //부모와 동일한 변수이름, 메소드를 불러올때는 그냥 super.~ 를 사용

    // public Emplyee(){
    //     super(); //부모 먼저 실행해라 9행으로 이동
    //     System.out.println("Employee 자식 실행!");
    // }
    //생성자(자식) - 정의를 해줘야함.

    public Emplyee(String name, int age, String dept){
            // super.setAge(age);   //부모에서 받아와야함.
            // super.setName(name);
            super(name, age);
            this.dept = dept;
            System.out.println("Employee 자식 실행!");
        }
}
//자식클래스(2)
class Student extends Person{
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toStriing(){
        return super.toStriing()+ ":" + major;
    } 

    //생성자(자식) - 정의를 해줘야함.
    public Student(String name, int age, String dept){
            super(name, age);
            this.major = major;
            System.out.println("Student 자식 실행!");
        }
}

//출력 확인 하는곳.
public class Inherit{
    public static void main(String[] args) {
        // Emplyee sanago = new Emplyee(); // 50행으로 이동
        Emplyee huiba = new Emplyee("오정잉",47,"입학처"); //실행불가: 50행에서 디폴트()으로 설정했기 때문에;
        //55행에서 형식을 맞춰주면 가능 하지만, 59~60행처럼 정의를 해줘야함.
        Student choding = new Student("잼민킹",12,"수학"); //59행처럼 또 정의해야함, 그럼 매번 같은짓을 해야하는가?
        //공통입력 부분인 String name과 int age를 9행 부모클래스 생성자에 형식으로 넣고, 61행과 84행처럼 super(name,age); 처리함.

    }

}