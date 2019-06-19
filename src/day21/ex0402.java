package day21;

public class ex0402 {

	public static void main(String[] args) {

		String name = "AAbbbcccceeeedddd";
		String empty = "";
		for (int x = 0; x < name.length(); x++) {
			String check = name.charAt(x) + "";
			if (empty.contains(check)) {
				

			} else {
				empty = empty + check;
			}

		}
		System.out.println(empty);
	}

}
