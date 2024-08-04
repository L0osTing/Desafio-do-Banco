public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Conta contaCorrente = new ContaCorrente("123", 1000, 500);
        Conta contaPoupanca = new ContaPoupanca("456", 2000, 0.01);

        Cliente cliente1 = new Cliente("João Silva", "111.111.111-11", contaCorrente);
        Cliente cliente2 = new Cliente("Maria Oliveira", "222.222.222-22", contaPoupanca);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        System.out.println(banco);

        Transacao transacao = new Transacao(contaCorrente, contaPoupanca, 300);
        if (transacao.executar()) {
            System.out.println("Transação realizada com sucesso!");
        } else {
            System.out.println("Falha na transação.");
        }

        System.out.println(cliente1);
        System.out.println(cliente2);

        contaPoupanca.aplicarJuros();
        System.out.println("Saldo após aplicação de juros: " + contaPoupanca.getSaldo());
    }
}
