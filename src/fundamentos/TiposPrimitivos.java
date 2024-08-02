package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Funcionarios Info

		// Tipos Numéricos inteiros
		byte anosEmpresa = 127;
		short numerosVoos = 542;
		int id = 56789;
		long pontosAcumulados = 5_234_845_223L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double bonus = 3_354_958_658.99;

		// Tipo boleano
		boolean recebeu_bonus = true;

		// Tipo Caracter
		char status = 'A';

		// Prints

		System.out.println("O funcionario " + id + " acumulou " + pontosAcumulados + " pontos.");
		System.out
				.println("O funcionario " + id + " possui um salário de " + salario + " e um bonus de " + bonus + ".");
		System.out.println("O funcionario " + id + " possui o status " + status + ".");
		System.out.println("O funcionario " + id + " possui " + (anosEmpresa * 365) + " dias trabalhados e realizou "
				+ (numerosVoos * 2) + " voos");
	}
}
