package java8;

import java.util.function.Function;

public class MyFunction implements Function<String, Integer> {

	@Override
	public Integer apply(String string) {
		int length = string.length();
		return length;
	}

}
