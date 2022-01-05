package 두잇자바.chap01;
// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.

 class Q1 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max){max=b;}
        if(c>max){max=c;}
        if(d>max){max=d;}
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println("max(1,2,3,4) = "+max4(1,2,3,4)); //4
        System.out.println("max(4,3,2,1) = "+max4(4,3,2,1)); //4
        System.out.println("max(5,6,7,8) = "+max4(5,6,7,8)); //8
        System.out.println("max(8,7,6,5) = "+max4(8,7,6,5)); //8
    }
    
}
