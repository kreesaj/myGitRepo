package om.moh.training.test1;

public class BetterProgrammerTask1 {
 public static void main (String[] args)
 {
	
	 int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
	 
	 for (int i=0;i<input.length;i++)
	 {
		 for (int j=i+1;j<input.length;j++)
		 {
			 if (input[i]==input[j])
			 {
				 for (int k=j+1;k<input.length;k++)
				 input[j]=input[j+1];
			 }
		 }
	 }
	 
	 /* new test();
	 
	int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
    int current = input[0];
    boolean found = false;

    for (int i = 0; i < input.length; i++) {
    	System.out.println(!found);
        if (current == input[i] && !found) {
            found = true;
        } else if (current != input[i]) {
            System.out.print(" " + current);
            current = input[i];
            found = false;
        }
    }
    System.out.print("ffdf " + current);

 */
 }
}
