package principal;

import java.util.Scanner;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Cachorro, gato ou vaca?");
		String resposta = scn.next().toLowerCase();
		
		if(resposta.equals("gato")) {
			Gato x = new Gato();
			System.out.print(x.emitirSom());
		}
		else if(resposta.equals("cachorro")){
			Cachorro x = new Cachorro();
			System.out.println(x.emitirSom());
		}else {
			Vaca x = new Vaca();
			System.out.println(x.emitirSom());
		}

		scn.close();
	}

}
