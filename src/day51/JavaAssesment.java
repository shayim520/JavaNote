package day51;

public class JavaAssesment extends Assesment {

	int level;

	public static void main(String[] args) {

		System.out.println(Assesment.timelimit);
		System.out.println(timelimit);
		System.out.println(JavaAssesment.timelimit);

		Assesment.printTimelimit();
		printTimelimit();
		JavaAssesment.printTimelimit();
	}

}
