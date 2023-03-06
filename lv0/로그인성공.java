package lv0;

public class 로그인성공 {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		int a=0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(db[i][j].contains(id_pw[i])) {
					a=1;
				}
				else a=2;				
			}
		}
		System.out.println(a);
		
		for(int i=0; i<3; i++) {
				if(db[i][1].contains(id_pw[0])) {
					a=3;
				}
				else a=4;
		}
		System.out.println(a);
	}

}
