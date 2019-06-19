package day20;

public class ex1 {

	public static void main(String[] args) {

		String s = "Shyimardan520";
		int i = 0;
		String stored = "";
		String stored1 = "";

		while (i < s.length()) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z' || (c >= 'A' && c <= 'Z')) {
				System.out.println(c);
				stored = stored + c;
			}
			

			if (c >= '0' && c <= '9') {
				System.out.println(c);
				stored1 = stored1 + c;
			}
			++i;
		}

		System.out.println(stored);
		System.out.println(stored1);
		System.out.println(stored + stored1);

	}

}
