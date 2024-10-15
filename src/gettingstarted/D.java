package gettingstarted;

public class D {

	public static void main(String[] args) {
		Integer i=260;
		byte x=i.byteValue();
System.out.println(x);/*When you convert an Integer to a byte in Java, the value is truncated to fit into the byte range, which is from -128 to 127. The byte type uses only 8 bits, so the conversion results in a loss of data when the Integer value exceeds this range.

Here's a breakdown of the conversion process for Integer i = 257;:

Conversion of Integer to Byte:

The Integer value 257 is represented in binary as 00000001 00000001 (in 16 bits).
When converted to byte, only the lower 8 bits are considered, which are 00000001 in this case.
Value of the Byte:

The binary 00000001 corresponds to the decimal value 1.*/
	}

}
