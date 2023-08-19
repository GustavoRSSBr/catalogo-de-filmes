package filme;
import java.util.Scanner;
import java.util.ArrayList;

public class Diretor extends Pessoa {
    private ArrayList<Diretor> listaDiretores = new ArrayList<>();

    public void cadastrarDiretor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos diretores deseja cadastrar para esse filme?");
        int quantidadeDiretor = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeDiretor; i++) {
            public void nomePessoa() {
                super.nomePessoa();
            }

            System.out.println("Em qual área ele atuou?");
            String areaDiretor = scanner.nextLine();

            Diretor novoDiretor = new Diretor(nomeDiretor);
            listaDiretores.add(novoDiretor);
        }
        scanner.close();
    }
}