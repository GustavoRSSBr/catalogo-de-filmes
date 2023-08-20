package View;

import java.util.Scanner;
import controller.ControleFilme;

public class Main {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        int opcaoMenu = -1;
        ControleFilme controle = new ControleFilme();

        do {
            limparTela();
            mostrarMenuPrincipal();
            try {
                opcaoMenu = Integer.parseInt(leituraTeclado.next());
            } catch (Exception e) {
                System.out.println("\nOpção inválida! Tente novamente.\n");
                continue;
            }

            switch (opcaoMenu) {
                case 1: // Filmes
                    limparTela();
                    mostrarMenuFilmes();
                    break;
                case 2: // Atores
                    limparTela();
                    mostrarMenuAtores();
                    break;
                case 3: // Diretores
                    limparTela();
                    mostrarMenuDiretores();
                    break;
                case 0:
                    continue;
                default:
                    break;
            }

            try {
                opcaoMenu = Integer.parseInt(leituraTeclado.next());
            } catch (Exception e) {
                System.out.println("\nOpção inválida! Tente novamente.\n");
                continue;
            }

            switch (opcaoMenu) {
                case 4: // Listar filmes
                    controle.listarFilmes();
                    break;
                case 5: // Cadastrar novo filme
                    controle.cadastrarFilme();
                    break;
                case 6: // Buscar filme
                    controle.buscarNomeFilme();
                    break;
                case 7: // Listar atores
                    controle.listarAtores();
                    break;
                case 8: // Cadastrar novo ator
                    //controle.cadastrarAtores();
                    break;
                case 9: // Listar diretores
                    controle.listarDiretores();
                    break;
                case 10: // Cadastrar novo diretor
                    //controle.cadatrarDiretor();
                    break;
                case 0:
                    continue;
                default:
                    break;
            }
        } while (opcaoMenu != 0);

        leituraTeclado.close();
    }
    public static void mostrarMenuPrincipal(){
        System.out.println("\n\nCatálogo de Filmes");
        System.out.println("1 - Filmes");
        System.out.println("2 - Atores");
        System.out.println("3 - Diretores");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }

    public static void mostrarMenuFilmes(){
        System.out.println("\n\nCatálogo de Filmes");
        System.out.println("1 - Filmes");
        System.out.println("   4 - Listar Filmes");
        System.out.println("   5 - Cadastrar Novo Filme");
        System.out.println("   6 - Buscar Filme");
        //System.out.println("   N - Editar Filme");
        //System.out.println("   N - Excluir Filme");
        System.out.println("2 - Atores");
        System.out.println("3 - Diretores");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }
    public static void mostrarMenuAtores(){
        System.out.println("\n\nCatálogo de Filmes");
        System.out.println("1 - Filmes");
        System.out.println("2 - Atores");
        System.out.println("   7 - Listar Atores");
        System.out.println("   8 - Cadastrar Novo Ator");
        //System.out.println("   N - Buscar Ator");
        //System.out.println("   N - Editar Ator");
        //System.out.println("   N - Excluir Ator");
        System.out.println("3 - Diretores");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }
    public static void mostrarMenuDiretores(){
        System.out.println("\n\nCatálogo de Filmes");
        System.out.println("1 - Filmes");
        System.out.println("2 - Atores");
        System.out.println("3 - Diretores");
        System.out.println("   9  - Listar Diretores");
        System.out.println("   10 - Cadastrar Novo Diretor");
        //System.out.println("   N - Buscar Diretor");
        //System.out.println("   N - Editar Diretor");
        //System.out.println("   N - Excluir Diretor");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }
    public static void limparTela() {
        // Formato 1
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {}

        /* Formato 2
        System.out.print("\033[H\033[2J");
        System.out.flush();
        */

        // Formato 3
        //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
