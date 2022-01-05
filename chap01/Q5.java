package 두잇자바.chap01;
//med4와 med3 메서드를 비교평가 해라
//효율 med3 > med4 이유는?
//사실상 (b>=a && c<=a) 과 (b<=a && c>=a)는 같은 표현
//사실상 (a>b && c<b)   과 (a<b && c>b)  는 같은 표현.

class Q5{
    static int med4(int a, int b, int c){
        if((b>=a && c<=a) || (b<=a && c>=a))
            return a;
        else if((a>b && c<b) || (a<b && c>b))
            return b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("med4(3,2,1) = " + med4(3, 2, 1));
        System.out.println("med4(3,1,2) = " + med4(3, 1, 2));
        System.out.println("med4(3,2,2) = " + med4(3, 2, 2));
        System.out.println("med4(3,2,3) = " + med4(3, 2, 3));
        System.out.println("med4(2,1,3) = " + med4(2, 1, 3));
        System.out.println("med4(3,3,2) = " + med4(3, 3, 2));
        System.out.println("med4(2,2,3) = " + med4(2, 2, 3));
        System.out.println("med4(2,3,1) = " + med4(2, 3, 1));
        System.out.println("med4(1,3,2) = " + med4(1, 3, 2));
        System.out.println("med4(2,3,3) = " + med4(2, 3, 3));
        System.out.println("med4(1,2,3) = " + med4(1, 2, 3));
    }
}
