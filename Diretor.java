package filme;
import java.util.Scanner;
import java.util.ArrayList;

public class Diretor extends Pessoa {
    private int quantidadeDiretor;
    private String areaDiretor;
    private ArrayList<Diretor> listaDiretores = new ArrayList<>();

    public int getQuantidadeDiretor() {
        return quantidadeDiretor;
    }

    public void setQuantidadeDiretor(int quantidadeDiretor) {
        this.quantidadeDiretor = quantidadeDiretor;
    }

    public String getAreaDiretor() {
        return areaDiretor;
    }

    public void setAreaDiretor(String areaDiretor) {
        this.areaDiretor = areaDiretor;
    }

    public void cadastrarDiretor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos diretores deseja cadastrar para esse filme?");
        quantidadeDiretor = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeDiretor; i++) {
            nomePessoa(); // Chama o método da classe Pai (Pessoa)

            System.out.println("Em qual área ele atuou?");
            String areaDiretor = scanner.nextLine();

            Diretor novoDiretor = new Diretor();
            novoDiretor.setNome(getNome()); // Herdado da classe Pessoa
            novoDiretor.setAreaDiretor(areaDiretor);

            listaDiretores.add(novoDiretor);
        }

        scanner.close();
    }
}
}