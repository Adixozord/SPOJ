class NimGame {
	
	public static void main(String[] args) {
		
		int turnResult, secondPick, firstPick;
		
		turnResult = 2;
		secondPick = 1;
		
		for (int i = 1; i < 16; i++) {

			System.out.println(turnResult);
			firstPick = secondPick + turnResult;
			secondPick = turnResult;
			turnResult = firstPick;
		}

	}
}
