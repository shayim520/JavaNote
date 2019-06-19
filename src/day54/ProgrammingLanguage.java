package day54;

public class ProgrammingLanguage extends Language{
	public static void main(String[] args) {
		
	}
	
//	@Override
//public void obeyGrammaRule() {
//		
//		System.out.println("must obey syntax rule");
//		super.obeyGrammaRule();
//	}
//	
//	
//	public final static void display() {
//		System.out.println("must obey syntax rule");
//
//	}

}

class Language{
	
	public final void obeyGrammaRule() {
		
		System.out.println("must obey syntax rule");
	}
	
	public final static void display() {
		System.out.println("must obey syntax rule");

	}
}
