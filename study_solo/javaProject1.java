package 두잇자바.study_solo;
// 2. 상품 정보를 저장할 Product 클래스 생성
//  - 멤버 변수 : prdNo, prdName, prdPrice, prdYear, prdMaker
//  - 변수 타입은 데이터 용도에 맞게 지정
//  - 매개변수가 있는 생성자 : 객체 생성 시 값을 전달 받아서 멤버 변수 값 초기화
// -  데이터 출력 : toString() 사용

class Product{
    int prdNo;
    String prdName;
    int prdPrice;
    int prdYear;
    String prdMaker;

    public Product(int prdNo, String prdName, int prdPrice,int prdYear,String prdMaker){
        this.prdNo = prdNo;
        this.prdName=prdName;
        this.prdPrice=prdPrice;
        this.prdYear=prdYear;
        this.prdMaker=prdMaker;
    }

    public String toString(){
        return String.format("%03d %s %-7d %d %s",prdNo,prdName,prdPrice,prdYear,prdMaker);
    }
}

// 3. main()이 포함된 ProductTest 클래스 생성
//  - 아래 그림과 같이 Product 클래스 객체를 생성하고 값 초기화
//  - 데이터 출력

class ProductTest{
    public static void main(String[] args) {
    
    Product laptop = new Product(1, "노트북", 1200000, 2021, "삼성");
    Product monitor = new Product(2, "모니터", 300000, 2021, "LG");
    Product mouse = new Product(3, "마우스", 30000, 2020, "로지텍");
    
    System.out.println(laptop.toString());
    System.out.println(monitor.toString());
    System.out.println(mouse.toString());

    }
}