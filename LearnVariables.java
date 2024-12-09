package week3.day1;

public class LearnVariables {

	String driver = "address"; // global --within class & outside of the method

	public void method() {
		String data = "vinoth";

		System.out.println(data);
		System.out.println(driver + "payment ");
	}

	public void method2() {
		System.out.println(driver + "Verify");

	}

	public static void main(String[] args) {

		LearnVariables obj = new LearnVariables();

		obj.method();
		obj.method2();

	}

}
