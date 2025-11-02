public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String zero = "";
		if(minutes < 10){
			zero = "0";
		}
		if(hours >= 12){
			System.out.println(hours - 12 + ":" + zero + minutes + " PM");
		}
		else{
			System.out.println(hours + ":" + zero + minutes + " AM");
		}
	}
}