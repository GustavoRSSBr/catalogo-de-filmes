package filme;
import java.util.Scanner;

public class Pessoa {
    private String nomePessoa;

    public void lerNome() {
        System.out.print("Digite o nome: ");
        Scanner scanner = new Scanner;
        nome = scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
