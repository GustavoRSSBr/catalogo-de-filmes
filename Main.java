import filme.ControleFilme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        int opcaoMenuPrincipal = -1;

        do {
            limparTela();
            mostrarMenuPrincipal();
            try {
                opcaoMenuPrincipal = Integer.parseInt(leituraTeclado.next());
            } catch (Exception e) {
                System.out.println("\nOpção inválida! Tente novamente.\n");
                continue;
            }

            int opcaoMenuSecundario = -1;
            switch (opcaoMenuPrincipal) {
                case 1: // Filme
                    limparTela();
                    mostrarMenuFilmes();
                    try {
                        opcaoMenuSecundario = Integer.parseInt(leituraTeclado.next());
                    } catch (Exception e) {
                        System.out.println("\nOpção inválida! Tente novamente.\n");
                        continue;
                    }
                    switch (opcaoMenuSecundario){
                        case 1: // Listar Filmes
                            limparTela();
                            ControleFilme.listarFilmes();
                            leituraTeclado.next();
                            break;
                        case 2: // Cadastrar Filme
                            limparTela();
                            //ControleFilme.cadastrarFilme();
                            leituraTeclado.next();
                            break;
                        case 3: // Buscar Filme
                            limparTela();
                            //ControleFilme.buscarFilme();
                            leituraTeclado.next();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: // Ator
                    limparTela();
                    mostrarMenuAtores();
                    break;
                case 3: // Diretor
                    limparTela();
                    mostrarMenuDiretores();
                    break;
                default:
                    break;
            }


        } while (opcaoMenuPrincipal != 0);
    }

    public static void mostrarMenuPrincipal(){
        System.out.println("Catálogo de Filmes");
        System.out.println("1 - Filmes");
        System.out.println("2 - Atores");
        System.out.println("3 - Diretores");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }

    public static void mostrarMenuFilmes(){
        System.out.println("FILMES");
        System.out.println("1 - Listar Filmes");
        System.out.println("2 - Cadastrar Novo Filme");
        System.out.println("3 - Buscar Filme");
        //System.out.println("4 - Editar Filme");
        //System.out.println("5 - Excluir Filme");
        System.out.println("9 - Retornar ao Menu Principal");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }
    public static void mostrarMenuAtores(){
        System.out.println("ATORES");
        System.out.println("1 - Listar Atores");
        System.out.println("2 - Cadastrar Novo Ator");
        //System.out.println("3 - Buscar Ator");
        //System.out.println("4 - Editar Ator");
        //System.out.println("5 - Excluir Ator");
        System.out.println("9 - Retornar ao Menu Principal");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }
    public static void mostrarMenuDiretores(){
        System.out.println("DIRETORES");
        System.out.println("1 - Listar Diretores");
        System.out.println("2 - Cadastrar Novo Diretor");
        //System.out.println("3 - Buscar Diretor");
        //System.out.println("4 - Editar Diretor");
        //System.out.println("5 - Excluir Diretor");
        System.out.println("9 - Retornar ao Menu Principal");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção desejada: ");
    }
    public static void limparTela() {}

}
