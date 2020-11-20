public class CriaConta {

//	Condi��o essencial para inicializar uma aplica��o!
	public static void main(String[] args) {

//  Dada uma Classe Conta, Instanciamos um Objeto do tipo Conta. Para isso adicionaremos a palavra-chave "new" e ao lado dela, 
//	adicionaremos o nome da Classe que servir� para a cria��o de Objetos. Neste caso, ser� a Classe "Conta", e vamos guardar o 
//	retorno de "new conta()" em uma Vari�vel chamada "primeiraConta"!
		
// 	No Java, assim como em outras linguagens, um Objeto nunca est� dentro de uma Vari�vel. O que tem dentro de uma Vari�vel � 
//	somente uma indica��o a um Objeto espec�fico, uma refer�ncia a um Objeto espec�fico.
		Conta primeiraConta = new Conta();
//	Especificaremos que o valor de "saldo" a ser exibido � referente � "primeiraConta". A navega��o entre "primeiraConta" e "saldo" 
//	ocorre atrav�s do caractere "."!
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
//	Duas formas de fazer acr�scimo.
		//primeiraConta = primeiraConta + 100;
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
//	Duas formas de fazer decrescimo.
		//primeiraConta = primeiraConta - 20;
		primeiraConta.saldo -= 20;
		System.out.println(primeiraConta.saldo);

//	Daremos uma instancia��o atrav�s do nosso c�digo base embutido em Conta. Com isso, j� temos os atributos (saldo, ag�ncia, numConta
//	e titular) na conta nova que iremos trabalhar. Adicionamremos, tamb�m, a palavra chave "new". A informa��o devolvida por "new" ser�
//	guardada dentro da refer�ncia "segundaConta", que ser� uma Vari�vel do tipo Conta. Quando acionamos a palavra-chave "new" e o Java
//	Instancia o Objeto, todos os campos s�o zerados.
		Conta segundaConta = new Conta();
		
//	N�o podemos simplesmente escrever no nosso c�digo "saldo = 50", pois o programa n�o achar� a vari�vel "saldo" no escopo, e ainda
//	que achasse, existem m�ltiplos saldos devido a variedade de contas banc�rias. Por isso, sempre devemos escrever a "refer�ncia . atributo"
//	ou seja, trabalhar de uma forma "Orientada ao Objeto".
		segundaConta.saldo = 50;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
//	Se tentarmos imprimir os valores de "agencia" e "numConta" vamos receber o Valor Padr�o (valor default) de Int, que no caso � 0.
//	No caso do tipo Boolean o valor � "false".
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.numConta);

		System.out.println("referenciar: " + primeiraConta);
		
//	S�o refer�ncias a Objetos diferentes, e o (==) compara refer�ncias (endere�os de mem�ria)!
		if (primeiraConta == segundaConta) {
			System.out.println("S�o iguais!");
		} else {
			System.out.println("Contas diferentes!");
		}
	
//	Vamos imprimir o endere�o de mem�ria da "primeiraConta" e da "segundaConta"! 
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
