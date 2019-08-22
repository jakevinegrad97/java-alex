package unaryOperator;

import java.util.function.UnaryOperator;

public class View {

	public static void main(String[] args) {
		UnaryOperator<Double> xSquared = x -> x * x; 
//		{
//			double y = x * x;
//			return y;
//		};
		
		System.out.println(xSquared.apply(3D));
	}
}
