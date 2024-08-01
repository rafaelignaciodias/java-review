package fundamentos;

import java.util.Scanner;

public class Tempertura {

	public static void main(String[] args) {

		final double FATOR = 32;
		final double MULTIPLICADOR = 5.0 / 9.0;

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Fahrenheit degree: ");

		double temperature = scanner.nextDouble();

		double celsius = (temperature - FATOR) * MULTIPLICADOR;
		String celsiusFormatted = String.format("%.2f", celsius);
		System.out.println("Celsius degree: " + celsiusFormatted + "˚");
	}
}
