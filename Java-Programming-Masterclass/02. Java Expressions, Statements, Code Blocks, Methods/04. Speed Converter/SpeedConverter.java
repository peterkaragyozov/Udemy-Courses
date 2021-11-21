
public class SpeedConverter {

	public static void main(String[] args) {
		
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);

	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
        long result = Math.round(kilometersPerHour / 1.609);
        if (result < 0) {
            return -1;
        }
        return result;
    }
    
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long result = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
        
    }

}
