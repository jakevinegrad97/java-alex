package java8;

import java.util.function.Function;

public class View {

	public static void main(String[] args) {
//		Function<String, Integer> function = new MyFunction();
//		System.out.println(function.apply("Hello!"));
		
		Function<String, Integer> newFunction = new Function<String, Integer>() {
			@Override
			public Integer apply(String string) {
				return 1;
			}
		};
		
		System.out.println(newFunction.apply("HGGFHGHJKJLLK:"));
		
		Function<String, Integer> lambdaFunction = string -> string.length();
		
		System.out.println(lambdaFunction.apply("Jake"));
		
		Function<String, String> alexFunction = string -> {
			String result = "";
			for(int i = string.length() - 1; i >= 0; i--) {
				result += string.substring(i, i + 1);
			}
			return result;
		};
		
		System.out.println(alexFunction.apply("Hello"));
	}
}
