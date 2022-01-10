package 두잇자바.study_solo;
// 2. 도서 정보를 저장할 Book 클래스 생성
// - 멤버 변수 : bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher
// - 변수의 데이터 타입은 데이터 용도에 맞게 지정
// - 매개변수가 있는 생성자 : 객체 생성 시 값을 전달 받아서 멤버 변수 값 초기화
// - 데이터 출력 : toString() 사용
class Book {
    String bookNo; // 도서번호
    String bookTitle; // 도서명
    String bookAuthor; // 저자
    int bookYear; // 발행일
    int bookPrice; // 가격
    String bookPublisher; // 출판사

    public Book(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookYear = bookYear;
        this.bookPublisher = bookPublisher;
    }

    public String toString() {
        return String.format("%s %s %s %d %d %s", bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
    }
}

// 3. Book 클래스를 상속받는 Magazine 클래스 생성
// - 멤버 변수 : month
// - 매개변수가 있는 생성자 : 객체 생성 시 값을 전달 받아서 멤버 변수 값 초기화
// - 데이터 출력 : toString() 사용
class Magazine extends Book {
    int month; // 발행월

    public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear,
            String bookPublisher, int month) {
        super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
        this.month = month;
    }

    public String toString() {
        return String.format("%s %s %s %d %d %s %3d", bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher,
                month);
    }

}
// 4. main()이 포함된 BookTest 클래스 생성
// - 아래 그림과 같이 Book, Magazine 클래스 객체를 생성하고 값 초기화
// - 데이터 출력

class BookTest {
    public static void main(String[] args) {
        Book javaProgramming = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
        Book javaScript = new Book("B002", "자바 스크립트", "이몽룡", 30000, 2020, "서울출판사");
        Book html_css = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");
        // Book javaScript = new Book("B002","자바 스크립트 ","이몽룡",30000,2020,"서울출판사");
        // Book html_css = new Book("B003","HTML/CSS ","성춘향",18000,2021,"강남출판사");

        System.out.println(javaProgramming.toString());
        System.out.println(javaScript.toString());
        System.out.println(html_css.toString());

        Magazine javaWorld = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
        Magazine webWorld = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
        // Magazine webWorld = new Magazine("M002", "웹 월드  ", "이몽룡", 30000, 2020, "서울출판사", 7);
        Magazine gameWorld = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
        System.out.println(javaWorld.toString());
        System.out.println(webWorld.toString());
        System.out.println(gameWorld.toString());

    }
}