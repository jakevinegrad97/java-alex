package noInputs;

public class View {

	public static void main(String[] args) {
		Gurneet gurneet = () -> "headlock!!!!";
		
		String headlock = gurneet.g();
		
		System.out.println(headlock);
	}
}
