package om.moh.training;

public class BetterProgrammerTask {

	public static void main(String[] args) {
		int result;
		BetterProgrammerTask app = new BetterProgrammerTask();

		result = app.getSumOfNumbers("1 jas 2 test    13 4 5");

		System.out.println(result);
	}

	public static int getSumOfNumbers(String s) {
		/*
		 * Please implement this method to return the sum of all integers found
		 * in the parameter String. You can assume that integers are separated
		 * from other parts with one or more spaces (' ' symbol). For example,
		 * s="12 some text 3  7", result: 22 (12+3+7=22)
		 */
		String[] passtr = s.split(" ");
		int n = 0;
		int sum = 0;
		for (int i = 0; i < passtr.length; i++) {
			int sum1 = 0;
			try {

				sum = sum + Integer.parseInt(passtr[i]);
			} catch (Exception e) {

			}

		}
		return sum;
	}
}
