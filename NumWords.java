// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number= Integer.parseInt(args[0]);
		int o= number%10;
		int t= number%100;
		int tens= (t-o)/10;
		int hundreds= number/100;
	    System.out.println(hundreds + " hundreds, " + tens + " tens, and " + o + " ones ");
	}
}
