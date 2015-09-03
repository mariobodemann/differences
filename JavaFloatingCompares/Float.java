public class Float {

	static public final float FLOAT_ROUNDING_ERROR = 0.000001f; // 32 bits
	
	/** Returns true if a is nearly equal to b. The function uses the default floating error tolerance.
  	 * @param a the first value.
  	 * @param b the second value. 
  	 */
	static public boolean isEqual (float a, float b) {
		return Math.abs(a - b) <= FLOAT_ROUNDING_ERROR;
	}
	
	public static void main(String[] arguments) {
		int iterations = 200;
		float init = 0.51f;
		float increment = 0.01f;
		float value = init;
	
		for (int i = 0; i < iterations; ++i) {
			System.out.println(value + " == 2.0f? " + (value == 2.0f) + " .. LibGdx.isEqual()? " + isEqual(value, 2.0f));
			value += increment;
		}

	}

}
