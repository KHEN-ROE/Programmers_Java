package Programmers_Java.lv1;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";
        int answer = 0;

        String s = "";
        int index = 0;
        String [] str = t.split("");
        for (long i = 0; i < str.length; i++) {
            for (long j = i; j < str.length; j++) {
                s += str[(int) j];
                index++;
                if(j==str.length-1){
                    s += ",";
                }
                if(index == p.length()) {
                    s += ",";
                    index = 0;
                    break;
                }
            }
        }
        String [] str2 = s.split(",");
        for (long i = 0; i < str2.length; i++) {
            if(str2[(int) i].length() < p.length()) {
                str2[(int) i] = str2[(int) i].replace(str2[(int) i],"");
            }
        }

        long a = Long.parseLong(p);
        for (long j = 0; j < str2.length; j++) {
            if(!str2[(int) j].equals("")) {
            long b = Long.parseLong(str2[(int) j]);
                if (b <= a) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
