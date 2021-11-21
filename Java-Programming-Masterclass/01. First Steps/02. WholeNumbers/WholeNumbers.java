
public class WholeNumbers {

	public static void main(String[] args) {
		/*The width of byte (8 bits), short (16 bits), int (32 bits) and long (64 bits). 
		Exceeding them results in overflow*/
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		
		// We put an L after the long literal so that Java knows not to treat it as int
		long myLongValue = 100L;
		System.out.println(myLongValue);
		
		
		/*Type casting. By default Java treats them as int, thus with byte and short we have to put
		(byte) and (short) in front */
		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		short myNewShortValue = (short) (myMinShortValue / 2);

	}

}
