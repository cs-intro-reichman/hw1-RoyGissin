// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
			
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
      
	      
	    if (hours==12){
			System.out.println(hours + ":" + ("" + args[0].charAt(3) + args[0].charAt(4)) + " PM");
		}
         if(hours<12){
			System.out.println(hours + ":" + ("" + args[0].charAt(3) + args[0].charAt(4)) + " AM" );
		  }

	    if(hours>12){
			hours=hours%12;
			System.out.println(hours + ":" + ("" + args[0].charAt(3) + args[0].charAt(4)) + " PM" );

		}

	}
}