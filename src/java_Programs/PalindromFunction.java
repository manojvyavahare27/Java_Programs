package java_Programs;

public class PalindromFunction {

	public static void Palindrom(String str) {
		if (str.equals("")) {
			System.out.println("Pass the string");
		}

		String revStr = "";
		String orgStr = str;
		int Strlenght = str.length();
		for (int i = Strlenght - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println("Reverse String is:" + revStr);
		if (orgStr.equals(revStr))
		{
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not Palindrom");
		}
		//return orgStr;
	}
	public static void main(String[] args) {

		Palindrom("aabcbaa");

	}

}
