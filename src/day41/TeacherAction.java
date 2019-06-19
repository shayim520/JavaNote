package day41;

public class TeacherAction {

	public static void main(String[] args) {
		
		Teacher akbar = new Teacher();
		akbar.setName("Akbar");
		akbar.setSpecialty("magic");
		
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		akbar.setName("shay");
		akbar.setSpecialty("cool");
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		
		

	}

}
