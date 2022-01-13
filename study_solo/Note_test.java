package 두잇자바.study_solo;


class Ani{
    public static void main(String[] args) {
        String a = "a";
        StringBuilder b = new StringBuilder(a);
        b.deleteCharAt(0);
        a = b.toString();
        if(a == null){
            System.out.println("1. null입니다.");
        }else if(a == ""){
            System.out.println("2. 공백입니다.");
        }else{
            System.out.println("3. 모르겠습니다.");
        }

    }
}