package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		int burritosEatenWeek1 = 7;
		int burritosEatenWeek2 = 4;
		int burritosEatenWeek3 = 19; //don't judge me
		int burritosEatenWeek4 = 1;
		
<<<<<<< HEAD
		double totalBurritos = burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4;
		double averageWeeklyBurritos = totalBurritos / 4;
=======
		int totalBurritos = burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4;
		double averageWeeklyBurritos = (double)totalBurritos / 4;
>>>>>>> branch 'master' of https://github.com/CSE131FL24/studio-0-leefaisonvedovastudio0.git
		
		double burritoPrice = 7.50;
		double averageWeeklyPrice = averageWeeklyBurritos * burritoPrice;
		
		System.out.println("You have spent an average of $" + averageWeeklyPrice + " per week on burritos.");
	
		}
}
