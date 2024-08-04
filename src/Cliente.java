import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }
}
