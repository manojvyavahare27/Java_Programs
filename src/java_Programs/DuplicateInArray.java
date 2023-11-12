package java_Programs;

public class DuplicateInArray {

	public static void main(String[] args) {
		String a[] = { "java", "C", "C++", "C#", "Java", "C#" };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate string is: " + a[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("No Duplicate found");
		}
	}
}
