package day50;

public class AdminUser extends SlackUser{
	
	int adminLevel;

	public AdminUser(String displayName, int timeZone, String status, int adminLevel) {
		
		this.adminLevel = adminLevel;
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
		
	}

	
	public String toString() {
		return "AdminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	
	

}
