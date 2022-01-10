package 두잇자바.study_solo;

import javax.sound.midi.SysexMessage;

class Test{
    public static void main(String[] args) {
        String a = "자바 프로그래밍";
        String b = "HTML/CSS";


        System.out.println(a.getBytes().length);
        System.out.println(b.getBytes().length);

        System.out.printf("%-8s감자고구마\n", a);
        System.out.printf("%-15s감자고구마", b);


    }
}