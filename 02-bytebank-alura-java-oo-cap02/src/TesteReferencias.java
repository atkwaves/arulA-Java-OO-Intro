
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
//	Nos atentaremos para uma questão importante: A diferença entre o Tipo "Conta" e a Variável desse Tipo "primeiraConta".
//	A Variável não é um Objeto "Conta", e sim, uma indicação a um Objeto específico, uma referência de um Objeto. Sua repre-
//	sentação gráfica seria a flecha que referencia o objeto.
	
//	A princípio, podemos pensar que esta declaração gera uma cópia da "primeiraConta" para a "segundaConta" e teríamos uma 
//	espécie de "clone de objeto". A questão é que não há um objeto "Conta" à direita, e sim uma referência. O que copiamos 
//	é a referência para um mesmo objeto. Podemos pensar da seguinte forma, existe uma espécie de Id dos Objetos, que chamamos
//	de "3bf4". A Variável "primeiraConta" possui o valor "3bf4", fazendo referência ao Id do Objeto. Quando declaramos que
//	"primeiraConta = segundaConta", na verdade estamos copiando esse Id "3bf4" que é a referência, e não o Objeto em si.
		
//	O igual (=) no Java copia o que está na direita e cola na esquerda, neste caso vamos ter duas referências para o mesmo lugar.
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
//	Vamos notar que teremos também o valor de 400. Isso ocorre porque termos apenas uma única conta, e duas referências ligadas a ela.
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
//	Duas referências para o mesmo Objeto! Estamos comparando o mesmo endereço de memória.
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
//	Vamos imprimir o endereço de memória da "primeiraConta" e da "segundaConta"! 
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}


