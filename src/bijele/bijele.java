import java.util.Scanner;

public class bijele {
	Scanner sc = new Scanner(System.in);

	void run() {
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rook = sc.nextInt();
		int bish = sc.nextInt();
		int knight = sc.nextInt();
		int pawn = sc.nextInt();

		int kingNeeded = 1 - king;
		int queenNeeded = 1 - queen;
		int rookNeeded = 2 - rook;
		int bishNeeded = 2 - bish;
		int knightNeeded = 2 - knight;
		int pawnNeeded = 8 - pawn;
		
		String returnString = "";
		returnString += kingNeeded + " ";
		returnString += queenNeeded + " ";
		returnString += rookNeeded + " ";
		returnString += bishNeeded + " ";
		returnString += knightNeeded + " ";
		returnString += pawnNeeded;
		
		System.out.println(returnString);
	}

	public static void main(String[] a) {
		(new bijele()).run();
	}
}
