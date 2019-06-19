package day54;

public class SoccerClub {

	int playerCount;
	String name;
	Stadium stadium;
	
	public SoccerClub(int playerCount, String name, Stadium stadium) {
		
		this.playerCount = playerCount;
		this.name = name;
		this.stadium = stadium;
	}
	
	public char getInitial() {
		return name.charAt(0);
	}
	
	public int getStaduiumCapacity() {
		return stadium.capacity;
	}
	public static void main(String[] args) {
		
		Stadium st= new Stadium(10000,"Burger");
		System.out.println(st.toString());
		
		SoccerClub chelcea = new SoccerClub(25,"Chelcea",st);
		System.out.println(chelcea.toString());
		System.out.println(chelcea.getStaduiumCapacity());
		System.out.println(chelcea.getInitial());
		
		
	}
	
	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", name=" + name 
				       + ", stadium=" + stadium + "]";
	}
	
	public int getPlayerCount() {
		return playerCount;
	}
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stadium getStadium() {
		return stadium;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

}
