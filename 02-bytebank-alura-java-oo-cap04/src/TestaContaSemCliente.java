public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
//	Criaremos uma refer�ncia para Conta chamada "contaDaMarcela" utilizando a palavra-chave new.
		Conta contaDaMarcela = new Conta();
//	Acionando o sysout para saldo, o c�digo � compilado e o atributo zerado sem nenhum problema
		System.out.println(contaDaMarcela.saldo);
		
//	Mas se tentarmos fazer um procedimento parecido com titular, sem definirmos um Cliente para este atributo? Ao
//	executarmos a aplica��o, veremos que houve uma mensagem de erro. O "zero" de um atributo ou vari�vel do tipo 
//	refer�ncia, chamamos de  null, que  significa algo como refer�ncia para lugar nenhum. 
	
//	Podemos ter uma refer�ncia para nada no nosso c�digo. Na linha 17 do nosso c�digo, podemos realizar um sysout em 
//	"contaDaMarcela" e titular. Ao executarmos novamente o c�digo, veremos que o resultado da impress�o ser� a mensagem 
//	null antes do surgimento do erro. 
		System.out.println(contaDaMarcela.titular);
		//contaDaMarcela.titular.nome = "Marcela";
		//System.out.println(contaDaMarcela.titular.nome);
	
//	O nome do titular("Marcela") n�o faz refer�ncia a nenhum tipo Cliente. Para que a aplica��o seja executada corretamente, 
//	precisamos criar um novo cliente e fazer a associa��o entre Conta e Cliente. 
		
//	Faremos com que titular deixe de ser null, fazendo-o receber um novo cliente: new Cliente. H� casos em que n�o 
//	h� necessidade de criar uma vari�vel tempor�ria, podemos criar a associa��o em uma linha, como � o caso. Ao 
//	executarmos a aplica��o, ser� impresso um Id referente ao Cliente, revelando a associa��o feita entre os objetos. 
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);

		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.cpf = "123.456.789-01";
		contaDaMarcela.titular.profissao = "Enfermeira";
		
		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.titular.cpf);
		System.out.println(contaDaMarcela.titular.profissao);

	}
}