/**
 * 
 */

/**
 * @author Simon
 *
 */
public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		
		//System.out.println(Basic.getAddition(a, b));
		//System.out.println(Basic.getSubstraction(a, b));
		//System.out.println(Basic.getMultiplication(a, b));
		//System.out.println(Basic.getDivision(a, b));
		
		int [] values = {a, b};
		int [] emptyvalues = {};
		
		//System.out.println(Basic.getSumofIntArray(values));
		//System.out.println(Basic.getSumofIntArray(values)+Basic.getAddition(a, b));
		//System.out.println(Basic.getSumofIntArray(emptyvalues));
		
		//System.out.println(Basic.getModulo(a,b));
		//System.out.println(Basic.getModulo(b,a));
		
		//System.out.println(Basic.getNegativeSumofIntArray(values));
		String c = "Simon";
		String d = "Gassenschmidt";
		//System.out.println(Basic.getappendStringwithSpace(c, d));
		
		//System.out.println (Basic.getAddition(a, c));
		//System.out.println(a + c);
		
		double e = 424_499.2392;
		//System.out.println(e);
	}
	public static int getAddition (int a, int b) {
		return a+b;
	}
	public static int getSubstraction (int a, int b) {
		return a-b;
	}
	public static int getMultiplication (int a, int b) {
		return a*b;
	}
	public static int getDivision(int a, int b) {
		return a/b;
	}
	public static int getModulo(int a, int b) {
		return a%b;
	}
	public static int getSumofIntArray (int [] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static int getNegativeSumofIntArray (int [] array) {
		int sub = 0;
		for(int i = 0; i < array.length; i++) {
			sub -= array[i];
		}
		return sub;
	}
	public static int getSubstractionElementbyElementArray (int [] array) {
		int sum = array[0];
		for(int i = 1; i < array.length; i++) {
			sum = Basic.getSubstraction(sum, array[i]);
		}
		return sum;
		
	}
	public static String getappendStringwithSpace (String a, String b) {
		String c = a + " " + b;
		return c;
	}
}
