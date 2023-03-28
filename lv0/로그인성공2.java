package Programmers_Java.lv0;

public class 로그인성공2 {
    public static void main(String[] args) {
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String answer = "";



        for(int i=0; i< id_pw.length; i++) {
            for (int j = 0; j < db.length; j++) {
                if (id_pw[0].equals(db[j][0]) && id_pw[1].equals(db[j][1])) { //id pw 둘다 일치
                    answer = "login";
                } else if (id_pw[0].equals(db[j][0]) && !id_pw[1].equals(db[j][1])) { // id만 일치
                    answer = "wrong pw";
                } else if (!id_pw[0].equals(db[j][0]) && !id_pw[1].equals(db[j][1])) { // 둘다 불일치
                    answer = "fail";
                }
            }
        }
        System.out.println(answer);
    }
}
