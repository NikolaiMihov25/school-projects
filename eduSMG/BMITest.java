package eduSMG;

public class BMITest {

	public static void main(String[] args) {
		BMI pesho = new BMI("Pesho", 27, 82, 6, 2);
		System.out.println(pesho.calculateBMI(pesho));
	}

}
