// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double c= Double.parseDouble(args[0]);
		double r= Double.parseDouble(args[1]);
		double n= Double.parseDouble(args[2]); 
       double m=(r/100)+1;
		double x= Math.pow(m,n);
		double FV= c*x;
		System.out.println("The future value is: " +(int) FV);
	}

}