package oo.composicao;

public class Carro {

	Motor myMotor = new Motor();

	void ligar() {
		myMotor.ligado = true;
	}
	
	void desligar() {
		myMotor.ligado = false;
	}
	
	boolean estaLigado() {
		return myMotor.ligado;
	}
	
	void acelerar() {
		myMotor.fatorInjecao += 0.4;		
	}
	
	void frear() {
		if (myMotor.giros() > 2500) {
			myMotor.fatorInjecao -= 0.2;		
		}
	}

}
