public class CriaConta {

//	Condição essencial para inicializar uma aplicação!
	public static void main(String[] args) {

//  Dada uma Classe Conta, Instanciamos um Objeto do tipo Conta. Para isso adicionaremos a palavra-chave "new" e ao lado dela, 
//	adicionaremos o nome da Classe que servirá para a criação de Objetos. Neste caso, será a Classe "Conta", e vamos guardar o 
//	retorno de "new conta()" em uma Variável chamada "primeiraConta"!
		
// 	No Java, assim como em outras linguagens, um Objeto nunca está dentro de uma Variável. O que tem dentro de uma Variável é 
//	somente uma indicação a um Objeto específico, uma referência a um Objeto específico.
		Conta primeiraConta = new Conta();
//	Especificaremos que o valor de "saldo" a ser exibido é referente à "primeiraConta". A navegação entre "primeiraConta" e "saldo" 
//	ocorre através do caractere "."!
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
//	Duas formas de fazer acréscimo.
		//primeiraConta = primeiraConta + 100;
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
//	Duas formas de fazer decrescimo.
		//primeiraConta = primeiraConta - 20;
		primeiraConta.saldo -= 20;
		System.out.println(primeiraConta.saldo);

//	Daremos uma instanciação através do nosso código base embutido em Conta. Com isso, já temos os atributos (saldo, agência, numConta
//	e titular) na conta nova que iremos trabalhar. Adicionamremos, também, a palavra chave "new". A informação devolvida por "new" será
//	guardada dentro da referência "segundaConta", que será uma Variável do tipo Conta. Quando acionamos a palavra-chave "new" e o Java
//	Instancia o Objeto, todos os campos são zerados.
		Conta segundaConta = new Conta();
		
//	Não podemos simplesmente escrever no nosso código "saldo = 50", pois o programa não achará a variável "saldo" no escopo, e ainda
//	que achasse, existem múltiplos saldos devido a variedade de contas bancárias. Por isso, sempre devemos escrever a "referência . atributo"
//	ou seja, trabalhar de uma forma "Orientada ao Objeto".
		segundaConta.saldo = 50;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
//	Se tentarmos imprimir os valores de "agencia" e "numConta" vamos receber o Valor Padrão (valor default) de Int, que no caso é 0.
//	No caso do tipo Boolean o valor é "false".
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.numConta);

		System.out.println("referenciar: " + primeiraConta);
		
//	São referências a Objetos diferentes, e o (==) compara referências (endereços de memória)!
		if (primeiraConta == segundaConta) {
			System.out.println("São iguais!");
		} else {
			System.out.println("Contas diferentes!");
		}
	
//	Vamos imprimir o endereço de memória da "primeiraConta" e da "segundaConta"! 
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
