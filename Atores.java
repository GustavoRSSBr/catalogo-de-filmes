package filme;

import java.util.Scanner;
import java.util.ArrayList;

public class Atores extends Pessoa {
    private String nomePersonagem;
    private ArrayList<Atores> listaAtores = new ArrayList<>();

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public void cadastrarAtores() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Atores novoAtor = new Atores();
            novoAtor.lerNome();

            System.out.println("Como se chama o personagem?");
            String personagem = scanner.nextLine();
            novoAtor.setNomePersonagem(personagem);

            listaAtores.add(novoAtor);

            System.out.print("Deseja cadastrar mais um ator? (S/N): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}