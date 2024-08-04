import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Transacao {
    private Conta contaOrigem;
    private Conta contaDestino;
    private double valor;

    public Transacao(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    public boolean executar() {
        if (contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
