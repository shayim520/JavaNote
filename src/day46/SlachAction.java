package day46;

import java.util.ArrayList;

public class SlachAction {

	public static void main(String[] args) {
		
		SlackUse s1 =new SlackUse();
		
		System.out.println(s1);
		
		SlackUse s2 =new SlackUse("shaym520","shayim520@ufx.com",7);
		System.out.println(s2);
		
		s1.sendMessage("boss","employee");
		
		ArrayList<SlackUse> userList =new ArrayList<>();
		userList.add(s1);
		userList.add(s2);
		
		for(SlackUse each : userList) {
			System.out.println(each);
			
			each.sendMessage("dsada", "dafffgg");
		}
	}
	
	

}
