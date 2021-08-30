
public class OneMethod {
	public static float[] ONE(int a, int b){
		if(a < -10 || 
		   a > 10 ||	
		   b < -10 || 
		   b > 10  ) {
			throw new IllegalArgumentException("args can be in range <-10,10>");
		}
		float [] result = new float[3];
		result[0] = a*b;
		result[1] = (float)a/b;
		result[2] = a%b;
		return result;
	}
}
