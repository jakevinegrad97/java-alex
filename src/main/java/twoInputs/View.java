package twoInputs;

public class View {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> t + u;
		
		//exact same thing!
//		BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> {
//			int v = t + u;
//			return v;
//		};
		
		System.out.println(biFunction.f(2, 3));
		
		BiFunction<Integer, Integer, String> biFunction2 = (t, u) -> {
			String result = String.valueOf(t) + String.valueOf(u);
			return result;
		};
		
		String result = biFunction2.f(3, 4);
		System.out.println(result);
	}
}
