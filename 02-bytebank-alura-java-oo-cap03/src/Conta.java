public class Conta {

//	4 Atributos (Caracrteristicas do Objeto)
    double saldo;
    int agencia;
    int numero;
    String titular;

//  3 M�todos (Fun��es, uma maneira de fazer algo)
    
//  M�todo Depositar, adicionaremos nos par�nteses os Par�metros (argumento que est� sendo recebido pelo M�todo). Em Java n�o
//  se pode declarar uma Vari�vel sem especificar seu Tipo, portanto, especificaremos a Vari�vel "valor" como sendo do
//  do Tipo Double.
    public void deposita(double valor) {
    	
//  Podemos reparar que existe uma diferen�a de cores entre "saldo" e "valor", pois o primeiro � um Atributo do Objeto
//  "Conta", enquanto o segundo � uma Vari�vel.
    
//  Queremos que "saldo" seja relacionado � conta que est� envocando o M�todo "deposita()", para isso, faremos uso da 
//  palavra-chave This. Como o M�todo est� sendo invocado pela "contaDoPaulo", o "saldo" � referente a esta conta. N�o
//  inclu�mos a palavra-chave This junto � Vari�vel "valor", pois ela n�o � um Atributo de um Objeto.
    
//   
        this.saldo = this.saldo + valor;
//  Depois que depositamos um valor em uma determinada conta banc�ria, poderemos receber uma mensagem, um n�mero, uma
//  esp�cie de comprovante ou algo do g�nero. No caso do nosso projeto ByteBank, n�o h� qualquer tipo de retorno � a��o
//  de dep�sito. 
    
//  Quando n�o existe retorno ao acionarmos um M�todo, utilizamos a palavra-chave Void.
    }

//  Iremos fazer com que o M�todo "saca()" nos retorne um "boolean: true" caso o saque seja efetivado, "false" caso n�o.
    public boolean saca(double valor) {
//  Para prosseguirmos com o nosso c�digo, acionaremos a palavra-chave "IF". Usaremos, tamb�m, o This, que aciona a 
//  refer�ncia para a conta queu est� acionando o M�todo. Se o "saldo" de This for >= ao valor de saque, o novo saldo
//  ser� o "saldo" de This - "valor" de saque. O M�todo, ent�o, retornar� o valor "True". 
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
//   Caso contr�rio, ser� retornado o valor de "False".
        } else {
            return false;
        }
    }

//  Pensaremos sobre um ponto: quando transferimos dinheiro de uma conta para outra, receberemos uma informa��o de volta?
//  Neste caso, sim. Para que uma transfer�ncia seja realizada com sucesso, � necess�rio haver dinheiro suficiente em 
//  uma conta. Caso contr�rio, o retorno ser� "False". Usaremos o tipo Boolean.
    
//  Observe que adicionamos um segundo argumento, que foi separado por uma v�rgula (,) do primeiro. Foi necess�rio 
//  incluir um segundo argumento no m�todo referente a conta de destino do dep�sito, ou seja, a conta para onde o 
//  dinheiro ser� transferido. 
    public boolean transfere(double valor, Conta destino) {
//  Usaremos IF: caso o saldo de this (fazendo refer�ncia a contaDaMarcela) seja igual ou superior ao valor de 
//  transfer�ncia, ser� subtra�do de saldo o valor referente � transfer�ncia.
        if(this.saldo >= valor) {
            this.saldo -= valor;
//  Por enquanto, apenas retiramos um valor de saldo, precisaremos que este valor seja transferido para uma conta 
//  destino, no caso, "contaDoPaulo". Existem duas formas de executar essa fun��o, uma delas � esta:
            //destino.saldo += valor;
//  Ou, podemos reutilizar um M�todo da classe Conta, o deposita(). 
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}