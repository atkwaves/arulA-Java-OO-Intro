
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
//	Nos atentaremos para uma quest�o importante: A diferen�a entre o Tipo "Conta" e a Vari�vel desse Tipo "primeiraConta".
//	A Vari�vel n�o � um Objeto "Conta", e sim, uma indica��o a um Objeto espec�fico, uma refer�ncia de um Objeto. Sua repre-
//	senta��o gr�fica seria a flecha que referencia o objeto.
	
//	A princ�pio, podemos pensar que esta declara��o gera uma c�pia da "primeiraConta" para a "segundaConta" e ter�amos uma 
//	esp�cie de "clone de objeto". A quest�o � que n�o h� um objeto "Conta" � direita, e sim uma refer�ncia. O que copiamos 
//	� a refer�ncia para um mesmo objeto. Podemos pensar da seguinte forma, existe uma esp�cie de Id dos Objetos, que chamamos
//	de "3bf4". A Vari�vel "primeiraConta" possui o valor "3bf4", fazendo refer�ncia ao Id do Objeto. Quando declaramos que
//	"primeiraConta = segundaConta", na verdade estamos copiando esse Id "3bf4" que � a refer�ncia, e n�o o Objeto em si.
		
//	O igual (=) no Java copia o que est� na direita e cola na esquerda, neste caso vamos ter duas refer�ncias para o mesmo lugar.
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
//	Vamos notar que teremos tamb�m o valor de 400. Isso ocorre porque termos apenas uma �nica conta, e duas refer�ncias ligadas a ela.
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
//	Duas refer�ncias para o mesmo Objeto! Estamos comparando o mesmo endere�o de mem�ria.
		if (primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta!");
		}
//	Vamos imprimir o endere�o de mem�ria da "primeiraConta" e da "segundaConta"! 
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}


