package voidMethod;

public class View {

	public static void main(String[] args) {
		Printer printer = string -> System.out.println(string);
		
		printer.print("Alex");
	}
}
