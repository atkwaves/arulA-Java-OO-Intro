public class TestaMetodo {
	
	public static void main(String[] args) {
		
//	Para invocar um M�todo "deposita()", � necess�rio nos referenciar � uma conta espec�fica, neste caso, usaremos uma
//	Vari�vel chamada de "contaDoPaulo". � comum o nome de uma Vari�vel ser igual ao da Classe, sendo que a Vari�vel por
//	convec��o � escrita com letra min�scula.
		Conta contaDoPaulo = new Conta();
//	O saldo de "contaDoPaulo" ter� um valor de 100. 
		contaDoPaulo.saldo = 100;
//	Para invocarmos o M�todo "deposita()" utilizaremos o caractere ponto (.) seguindo dos par�metros que cont�m o valor
//	que queremos depositar, que no caso ser� 50.
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

//	Invoca��o de M�todo, obrigatoriamente usamos par�nteses.
		contaDoPaulo.saca(20);
	
//	A respeito do "True" e "False" do Boolean, quando passamos o mouse sobre o c�digo vemos o retorno do M�todo, podemos
//	ou n�o utilizar esse valor. Podemos guardar esse valor dentro de uma Vari�vel que chamaremos de "conseguiuRetirar", 
//	e acionaremos o SYSO!
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

//	Como par�metro, passaremos o valor de 300, que ser� transferido, e como par�metro de destino, incluiremos uma 
//	refer�ncia de "contaDoPaulo". Foi desnecess�rio colocar, por exemplo, o id da conta do Paulo. O m�todo vai receber 
//	um Vari�vel do Tipo conta, que n�o � um Objeto Conta.
		
//	Voc� pode ter ficado com a impress�o de que estamos passando uma conta dentro de um M�todo. Este n�o � o caso. 
//	N�s mandamos um "n�mero interno" que o Java enxerga e n�o precisa tanto da nossa aten��o. Evitamos adicionar 
//	"ContaDaMarcela", porque a conta de origem � o valor no primeiro par�metro. Ou seja, vamos passar apenas a conta 
//	de destino, considerando que a origem j� � o Objeto ao qual invocamos o M�todo. Seria equivalente a refer�ncia 
//	This do M�todo transfere() no outro lado. 
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