import java.util.*;

class ByeCakes {
	public static void buy(int eggs, int flour, int sugar, int milk, int rEggs, int rFlour, int rSugar, int rMilk) {
		
		int[] x = { eggs, flour, sugar, milk };
		int[] xr = { rEggs, rFlour, rSugar, rMilk };
		int[] toBuy = { 0, 0, 0, 0 };

		for (int i = 0; i < 4; i++) {
			if (x[i] < xr[i])
				toBuy[i] = Math.abs(x[i] - xr[i]);
			if ((x[i] + toBuy[i]) % xr[i] != 0)
				toBuy[i] += (x[i] - x[i] % xr[i]);
		}
		for (int g : toBuy) {
			System.out.print(g + " ");
		}
		System.out.println();

		int maxMultiple = (x[0] + toBuy[0]) / xr[0];
		for (int j = 1; j < 4; j++) {
			if ((x[j] + toBuy[j]) / xr[j] > maxMultiple)
				maxMultiple = (x[j] + toBuy[j]) / xr[j];
		}
		System.out.println(maxMultiple);
		for (int g : toBuy) {
			System.out.print(g + " ");
		}
		System.out.println();
		for (int t = 0; t < 4; t++) {
			while ((x[t] + toBuy[t]) / xr[t] < maxMultiple)
				toBuy[t] += x[t];
		}
		for (int g : toBuy) {
			System.out.print(g + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int eggs = 0;
		int flour = 0;
		int sugar = 0;
		int milk = 0;
		int rEggs = 0;
		int rFlour = 0;
		int rSugar = 0;
		int rMilk = 0;
		
		String[] ingredients = in.nextLine().split(" ");
		
		eggs = Integer.parseInt(ingredients[0]);
		flour = Integer.parseInt(ingredients[1]);
		sugar = Integer.parseInt(ingredients[2]);
		milk = Integer.parseInt(ingredients[3]);
		rEggs = Integer.parseInt(ingredients[4]);
		rFlour = Integer.parseInt(ingredients[5]);
		rSugar = Integer.parseInt(ingredients[6]);
		rMilk = Integer.parseInt(ingredients[7]);

		while (eggs != -1) {
			
			buy(eggs, flour, sugar, milk, rEggs, rFlour, rSugar, rMilk);
			
			ingredients = in.nextLine().split(" ");
			
			eggs = Integer.parseInt(ingredients[0]);
			flour = Integer.parseInt(ingredients[1]);
			sugar = Integer.parseInt(ingredients[2]);
			milk = Integer.parseInt(ingredients[3]);
			rEggs = Integer.parseInt(ingredients[4]);
			rFlour = Integer.parseInt(ingredients[5]);
			rSugar = Integer.parseInt(ingredients[6]);
			rMilk = Integer.parseInt(ingredients[7]);
		}
	}
}