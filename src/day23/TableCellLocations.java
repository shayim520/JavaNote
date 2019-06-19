package day23;

public class TableCellLocations {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			
//			  System.out.println("Row : " + i);
			for (int x = 1; x <= 4; x++) {
				System.out.print("|" + "____" + "|");
//			    System.out.print("cell(" + i + "," + x +") ");

			}
			System.out.println();
		}

	}

}
