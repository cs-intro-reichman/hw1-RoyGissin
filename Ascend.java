// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int a=(int) (Math.random()*x)+1;
		int b= (int) (Math.random()*x)+1;
		int c= (int) (Math.random()*x)+1;

		System.out.println(a + " " + b + " " + c);
        
		int min1= (int) (Math.min(a, b));
		int min2= (int) (Math.min(b, c));
		int min= (int) (Math.min(min1, min2));

		int max1= (int) (Math.max(a, b));
		int max2= (int) (Math.max(b, c));
		int max= (int) (Math.max(max1, max2));

		int sum= a+b+c;
		int mid= sum-(min+max);

		System.out.println(min + " " + mid + " " + max);

	




	}
}
