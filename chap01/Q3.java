package 두잇자바.chap01;
//네 값의 최솟값을 구하는 min4 메서드를 작성하세요.

class Q3 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b<min){min=b;}
        if(c<min){min=c;}
        if(d<min){min=d;}
        return min;
    }
    
    public static void main(String[] args) {
        System.out.println("min(1,2,3,4) = "+min4(1,2,3,4)); //1
        System.out.println("min(4,3,2,1) = "+min4(4,3,2,1)); //1
        System.out.println("min(5,6,7,8) = "+min4(5,6,7,8)); //5
        System.out.println("min(8,7,6,5) = "+min4(8,7,6,5)); //5
    }
    
}