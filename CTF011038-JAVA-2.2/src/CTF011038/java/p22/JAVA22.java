package CTF011038.java.p22;

public class JAVA22 {
//3
	public static void main(String[] args) {
		bark();
		primitive();
		finalvar();
	}
//1
	public static void bark() {
		String dogName = "Sushi";
		System.out.println("The Dog name = "+dogName+" bark");
	}
//2
	public static void primitive() {
		//a
		float myFloat = 9.1f;
		int myNewInt = (int)myFloat;
		System.out.println(myNewInt);
		//b
		int myInt = 10;
		float myNewFloat = (float)myInt;
		System.out.println(myNewFloat);
		//c
		double myDouble = 4.5d;
		float myNewFloatD = (float)myDouble;
		System.out.println(myNewFloatD);
		//d
		char myChar ='A';
		int myNewIntChar = (int)myChar;
		System.out.println(myNewIntChar);
	}
//3
	public static void finalvar() {
		final String finalStr = "Hello";
		finalStr="World";
		System.out.println(finalStr);
	}
}
