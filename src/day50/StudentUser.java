package day50;

public class StudentUser extends SlackUser{
	
	int groupNumber;
	
	public static void main(String[] args) {
		StudentUser s1 = new StudentUser();
	
	}
	
	
	
	 public StudentUser() {
		
		System.out.println( "Student User no arg");
	}



	public StudentUser(String displayName, int timeZone, 
			 String status,int groupNumber) {
			
			this.displayName = displayName;
			this.timeZone = timeZone;
			this.status = status;
			this.groupNumber = groupNumber;
			
		}
	 
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	 
	 

}
