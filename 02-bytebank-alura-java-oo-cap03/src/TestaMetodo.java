public class TestaMetodo {
	
	public static void main(String[] args) {
		
//	Para invocar um Método "deposita()", é necessário nos referenciar à uma conta específica, neste caso, usaremos uma
//	Variável chamada de "contaDoPaulo". É comum o nome de uma Variável ser igual ao da Classe, sendo que a Variável por
//	convecção é escrita com letra minúscula.
		Conta contaDoPaulo = new Conta();
//	O saldo de "contaDoPaulo" terá um valor de 100. 
		contaDoPaulo.saldo = 100;
//	Para invocarmos o Método "deposita()" utilizaremos o caractere ponto (.) seguindo dos parâmetros que contém o valor
//	que queremos depositar, que no caso será 50.
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

//	Invocação de Método, obrigatoriamente usamos parênteses.
		contaDoPaulo.saca(20);
	
//	A respeito do "True" e "False" do Boolean, quando passamos o mouse sobre o código vemos o retorno do Método, podemos
//	ou não utilizar esse valor. Podemos guardar esse valor dentro de uma Variável que chamaremos de "conseguiuRetirar", 
//	e acionaremos o SYSO!
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

//	Como parâmetro, passaremos o valor de 300, que será transferido, e como parâmetro de destino, incluiremos uma 
//	referência de "contaDoPaulo". Foi desnecessário colocar, por exemplo, o id da conta do Paulo. O método vai receber 
//	um Variável do Tipo conta, que não é um Objeto Conta.
		
//	Você pode ter ficado com a impressão de que estamos passando uma conta dentro de um Método. Este não é o caso. 
//	Nós mandamos um "número interno" que o Java enxerga e não precisa tanto da nossa atenção. Evitamos adicionar 
//	"ContaDaMarcela", porque a conta de origem é o valor no primeiro parâmetro. Ou seja, vamos passar apenas a conta 
//	de destino, considerando que a origem já é o Objeto ao qual invocamos o Método. Seria equivalente a referência 
//	This do Método transfere() no outro lado. 
		contaDaMarcela.transfere(200, contaDoPaulo);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}

}