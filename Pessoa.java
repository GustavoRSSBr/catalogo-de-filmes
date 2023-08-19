package filme;

public class Pessoa {
    private String nome;

    public void nomePessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o nome? ");
        this.nome = scanner.nextLine();
    }
    scanner.close();
}
