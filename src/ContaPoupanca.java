import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void aplicarJuros() {
        setSaldo(getSaldo() * (1 + taxaJuros));
    }
}
