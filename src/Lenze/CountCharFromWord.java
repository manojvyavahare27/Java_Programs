package Lenze;

public class CountCharFromWord {

	public static void main(String[] args) {

		String str = "Moanaoj";
		int strlength = str.length();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
					count++;
				}				
			}			
		}

	}

}
