package day46;

public class SlackUse {
	
	private String name ;
	private String email;
	private int gropNumber;
	public SlackUse(String name, String email, int gropNumber) {
		
		this.name = name;
		this.email = email;
		this.gropNumber = gropNumber;
	}
	
	public SlackUse() {
//		name = "shay";
//		email = "shay@hotmail.com";
//		gropNumber = 1;
		this("shay","shay@hotmail.com",1);
	}

	public void sendMessage(String channel, String content) {
		System.out.println("your name "+ this.name +" content " + content + " message " + channel);
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGropNumber() {
		return gropNumber;
	}
	public void setGropNumber(int gropNumber) {
		this.gropNumber = gropNumber;
	}
	
	public String toString() {
		return "SlackUse [name=" + name + ", email=" + email + ", gropNumber=" + gropNumber + "]";
	}
	
	

}
