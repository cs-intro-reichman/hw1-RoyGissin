public class dem {
    public static void main(String[] args) {
			
		int hours = Integer.parseInt("" + args[0].charAt(0) + ar);

		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
      
	      
	    if (hours==12){
			System.out.println(hours + ":" + minutes + " PM");
		}
         if(hours<12){
			System.out.println(hours + ":" + minutes + " AM" );
		  }

	    if(hours>12){
			hours=hours%12;
			System.out.println(hours + ":" + minutes + " PM" );

		}

	}
}
    
}
