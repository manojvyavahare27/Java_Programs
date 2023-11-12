package Lenze;

public class DuplicateInArray {

	public static void main(String[] args) {

		//String a[] = { "Java", "C++", "VB", "C#", "Java" };
		int a[]= {1,2,3,3,4,5,5,6};
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate String is found: " + a[i]);
					//flag = true;
				}
			}
		}
//		if (flag == false) {
//			System.out.println("No Duplicate found");
//		}
	}
}
