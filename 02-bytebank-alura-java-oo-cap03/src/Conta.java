public class Conta {

//	4 Atributos (Caracrteristicas do Objeto)
    double saldo;
    int agencia;
    int numero;
    String titular;

//  3 Métodos (Funções, uma maneira de fazer algo)
    
//  Método Depositar, adicionaremos nos parênteses os Parâmetros (argumento que está sendo recebido pelo Método). Em Java não
//  se pode declarar uma Variável sem especificar seu Tipo, portanto, especificaremos a Variável "valor" como sendo do
//  do Tipo Double.
    public void deposita(double valor) {
    	
//  Podemos reparar que existe uma diferença de cores entre "saldo" e "valor", pois o primeiro é um Atributo do Objeto
//  "Conta", enquanto o segundo é uma Variável.
    
//  Queremos que "saldo" seja relacionado à conta que está envocando o Método "deposita()", para isso, faremos uso da 
//  palavra-chave This. Como o Método está sendo invocado pela "contaDoPaulo", o "saldo" é referente a esta conta. Não
//  incluímos a palavra-chave This junto à Variável "valor", pois ela não é um Atributo de um Objeto.
    
//   
        this.saldo = this.saldo + valor;
//  Depois que depositamos um valor em uma determinada conta bancária, poderemos receber uma mensagem, um número, uma
//  espécie de comprovante ou algo do gênero. No caso do nosso projeto ByteBank, não há qualquer tipo de retorno à ação
//  de depósito. 
    
//  Quando não existe retorno ao acionarmos um Método, utilizamos a palavra-chave Void.
    }

//  Iremos fazer com que o Método "saca()" nos retorne um "boolean: true" caso o saque seja efetivado, "false" caso não.
    public boolean saca(double valor) {
//  Para prosseguirmos com o nosso código, acionaremos a palavra-chave "IF". Usaremos, também, o This, que aciona a 
//  referência para a conta queu está acionando o Método. Se o "saldo" de This for >= ao valor de saque, o novo saldo
//  será o "saldo" de This - "valor" de saque. O Método, então, retornará o valor "True". 
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
//   Caso contrário, será retornado o valor de "False".
        } else {
            return false;
        }
    }

//  Pensaremos sobre um ponto: quando transferimos dinheiro de uma conta para outra, receberemos uma informação de volta?
//  Neste caso, sim. Para que uma transferência seja realizada com sucesso, é necessário haver dinheiro suficiente em 
//  uma conta. Caso contrário, o retorno será "False". Usaremos o tipo Boolean.
    
//  Observe que adicionamos um segundo argumento, que foi separado por uma vírgula (,) do primeiro. Foi necessário 
//  incluir um segundo argumento no método referente a conta de destino do depósito, ou seja, a conta para onde o 
//  dinheiro será transferido. 
    public boolean transfere(double valor, Conta destino) {
//  Usaremos IF: caso o saldo de this (fazendo referência a contaDaMarcela) seja igual ou superior ao valor de 
//  transferência, será subtraído de saldo o valor referente à transferência.
        if(this.saldo >= valor) {
            this.saldo -= valor;
//  Por enquanto, apenas retiramos um valor de saldo, precisaremos que este valor seja transferido para uma conta 
//  destino, no caso, "contaDoPaulo". Existem duas formas de executar essa função, uma delas é esta:
            //destino.saldo += valor;
//  Ou, podemos reutilizar um Método da classe Conta, o deposita(). 
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}