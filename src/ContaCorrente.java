import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public void aplicarJuros() {
        // Contas correntes geralmente não têm juros
    }
}
