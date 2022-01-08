package 두잇자바.homework.Day09;
import java.util.Arrays;
//과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를 만드시오. 
//location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
//과제3) Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화)(51행)

class Animal {
    private String name;
    private String location;
    String[] limit = { "land", "sea", "air" };

    public Animal(String name, String location){
        setName(name);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("이름: "+name);
    }

    public String getLocation(String location) {
        if (Arrays.asList(limit).contains(location) == true) {
            this.location = location;
        } else {
            System.out.println("주거지 오류입니다.");
            System.exit(0);
        }
        return location;
    }

    public void setLocation(String location) {        
        getLocation(location);        
        System.out.println("주거지: "+location);
    }


    //출력 테스트
    public static void main(String[] args) {
        Animal apple = new Animal("사과","land");

        Animal pear = new Animal("배","house");

    }
}

//과제3) Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화)
class Tiger extends Animal{

    Tiger(){
        super("호랭이","land");
    }
    public static void main(String[] args) {
        Tiger bread = new Tiger();
    }
}
