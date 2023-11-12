package loops;

public class switchCase {

	public static void main(String[] args) {
		String month="jan";

		switch (month) {
		case "jan": {

			System.out.println("Number of days are 31 in month "+ month);
			break;
		}
		case "Feb":{
			System.out.println("Number of days are 28 or 29 in month "+ month);
			break;
		}
		case "March":{
			System.out.println("Number of days are 30 in month "+ month);
			break;
		}
		default:
			String key="Enter Valid Month";
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
