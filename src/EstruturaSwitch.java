import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		/*Crie um programa que permita ao usu�rio escolher o elogio que gostaria de receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio f�sico, 3 - Elogio pessoal
		 * Caso digite qualquer outro n�mero, deve ser exibida a mensagem "op��o inv�lida"*/
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("ELOGIADOR!");
		System.out.println("Selecione a op��o desejada:\n1-Elogio profissional\n2-Elogio f�sico\n3-Elogio pessoal");
		opcao = leitor.nextInt();
	
		switch(opcao) {
		    case 1:
			    System.out.println("Voc� �timo profissional");
			    break;
		    case 2:
			    System.out.println("Voc� tem um corpo lindo");
			    break;
		    case 3:
		    	System.out.println("Voc� e lindo");
		    	break;
		    default:
		    	System.out.println("N�o existe esse n�mero");
		}
		

		leitor.close();

	}

}
