package Lenze;

public class ReverseStr {

	public static void ReverseStr(String str) {
		String strRev = "";
		int strlenght = str.length();
		for (int i = strlenght - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		System.out.println(strRev);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseStr("1234");
		
	}

}
