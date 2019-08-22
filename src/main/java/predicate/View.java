package predicate;

import java.util.function.Predicate;

public class View {

	public static void main(String[] args) {
		Predicate<String> isLengthGreaterThan5 = string -> string.length() > 5;
//		{
//			int length = string.length();
//			return string.length() > 5;
//			if(length > 5) {
//				return true;
//			} else {
//				return false;
//			}
//		};
		
		System.out.println(isLengthGreaterThan5.test("Dingle"));
		
	}
}
