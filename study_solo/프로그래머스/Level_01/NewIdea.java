package 두잇자바.study_solo.프로그래머스.Level_01;
// https://programmers.co.kr/learn/courses/30/lessons/72410?language=java

// 신규 아이디 추천
// 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
class Song {
    public static void main(String[] args) {

        String new_id = "=.=";
        new_id = new_id.toLowerCase(); // 1단계
        new_id = new_id.replaceAll("[^0-9a-z._-]", ""); //2단계 https://earth-ing.tistory.com/32
        do{
        new_id = new_id.replace("..", "."); //3단계
        }while(new_id.contains(".."));
        
        StringBuilder id = new StringBuilder(new_id);
        if(new_id.charAt(0) == '.'){        //4단계
            if(new_id.length() <2){
                new_id = "";
            }else{
            id.deleteCharAt(0);
            new_id = id.toString();}
        }
        
        StringBuilder idd = new StringBuilder(new_id);
        if(new_id.charAt(new_id.length()-1) == '.'){    //4단계
            if(new_id.length() <2){
                new_id = "";
            }else{
            idd.deleteCharAt(new_id.length()-1);
            new_id = idd.toString();}
        }

        if(new_id == ""){   //5단계
            new_id = "a";
        }
        if(new_id.length() >15){    //6단계
            new_id = new_id.substring(0, 15);
            if(new_id.charAt(14) == '.'){
                new_id = new_id.substring(0,14);
                }
        }
        if(new_id.length() < 3){    //7단계
            char last = new_id.charAt(new_id.length()-1);
            do{
                new_id = new_id + last;
            }while(new_id.length() <3);
        }

        String answer = new_id;
        System.out.println(answer);

    }

}