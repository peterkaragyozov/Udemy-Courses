
public class FloatingPointPrecision {

	public static void main(String[] args) {
		
		//Minimum and maximum values of float and double
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);
		
		// Different ways to declare float and double		
		int myIntValue = 5;
		float myFloatValue = 5f;
		double myDoubleValue = 5d;
		
		int myIntValue1 = 5;
		float myFloatValue1 = 5.25f;
		float myFloatValue2 = (float) 5.25;
		double myDoubleValue1 = 5.25d;
		double myDoubleValue2 = 5.25;
				//floats aren't recommended to use, double is the preferred floating point data type
		
		// Dividing by 3
		int myIntValueD = 5 / 3;
		float myFloatValueD = 5f / 3f;
		double myDoubleValueD = 5d / 3d;
		
		System.out.println("MyIntValueD = " + myIntValueD);
		System.out.println("MyFloatValueD = " + myFloatValueD);
		System.out.println("MyDoubleValueD = " + myDoubleValueD);
		
		
		// Mini-challenge
		
		double pounds = 200d;
		double convertedKilograms = pounds * 0.45359237d;
		System.out.println(pounds + " pounds = " + convertedKilograms + " kg");
		
	}

}
