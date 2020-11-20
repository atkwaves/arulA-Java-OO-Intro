public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
//	Criaremos uma referência para Conta chamada "contaDaMarcela" utilizando a palavra-chave new.
		Conta contaDaMarcela = new Conta();
//	Acionando o sysout para saldo, o código é compilado e o atributo zerado sem nenhum problema
		System.out.println(contaDaMarcela.saldo);
		
//	Mas se tentarmos fazer um procedimento parecido com titular, sem definirmos um Cliente para este atributo? Ao
//	executarmos a aplicação, veremos que houve uma mensagem de erro. O "zero" de um atributo ou variável do tipo 
//	referência, chamamos de  null, que  significa algo como referência para lugar nenhum. 
	
//	Podemos ter uma referência para nada no nosso código. Na linha 17 do nosso código, podemos realizar um sysout em 
//	"contaDaMarcela" e titular. Ao executarmos novamente o código, veremos que o resultado da impressão será a mensagem 
//	null antes do surgimento do erro. 
		System.out.println(contaDaMarcela.titular);
		//contaDaMarcela.titular.nome = "Marcela";
		//System.out.println(contaDaMarcela.titular.nome);
	
//	O nome do titular("Marcela") não faz referência a nenhum tipo Cliente. Para que a aplicação seja executada corretamente, 
//	precisamos criar um novo cliente e fazer a associação entre Conta e Cliente. 
		
//	Faremos com que titular deixe de ser null, fazendo-o receber um novo cliente: new Cliente. Há casos em que não 
//	há necessidade de criar uma variável temporária, podemos criar a associação em uma linha, como é o caso. Ao 
//	executarmos a aplicação, será impresso um Id referente ao Cliente, revelando a associação feita entre os objetos. 
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