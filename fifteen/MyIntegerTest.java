package fifteen;

public class MyIntegerTest {

	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(17); MyInteger num2 = new MyInteger(17); MyInteger num3 = new MyInteger(10); 
		System.out.println(num1.isOdd());System.out.println(num1.isEven());System.out.println(num1.isPrime() + "\n");
		System.out.println(MyInteger.isOdd(num2));System.out.println(MyInteger.isEven(num2));System.out.println(MyInteger.isPrime(num2)+ "\n");
		System.out.println(MyInteger.isOdd(17));System.out.println(MyInteger.isEven(20));System.out.println(MyInteger.isPrime(19) + "\n");
		System.out.println(num1.equals(17));System.out.println(num2.equals(num1)+ "\n");
		System.out.println(MyInteger.parseInt(new char[] {'2' , '5', '8'}));
		System.out.println(MyInteger.parseInt("174"));
	}

}
