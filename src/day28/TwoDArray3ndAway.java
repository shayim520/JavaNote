package day28;

public class TwoDArray3ndAway {

	public static void main(String[] args) {
		
		int[] nums = {1,23,4};
		int[][] data = {{2,14,3},{4,5},{9,7} };
		
		for(int[] slice : data) {
			for(int bite : slice) {
				System.out.print(bite + " ");
			}
			System.out.println();

		}
		
		for(int i = 0; i <data.length;i++) {
			
			System.out.print("Row Number " + (i+1) + " : ");
			for(int j=0; j<data[i].length;j++) {
				System.out.print(data[i][j] + " ");
				
			}
			System.out.println();
		}
		

	}

}
