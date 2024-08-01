package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro myCarro = new Carro();
		
		myCarro.ligar();
		System.out.println(myCarro.myMotor.giros());
		
		myCarro.acelerar();
		myCarro.acelerar();
		System.out.println(myCarro.myMotor.giros());

		myCarro.frear();
		myCarro.frear();
		myCarro.frear();
		myCarro.frear();
		myCarro.frear();
		myCarro.frear();
		myCarro.frear();
		myCarro.frear();
		System.out.println(myCarro.myMotor.giros());
	}

}
