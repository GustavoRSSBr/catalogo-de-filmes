package filme;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleFilme {
	
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Filme> listaFilmes = new ArrayList<>();
	
	public void CadastrarFilme() {
		
		System.out.print("Digite o nome do filme: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite a data de lançamento: ");
		String data = sc.nextLine();
		
		System.out.print("Digite o orçamento do filme: ");
		double orcamento = Double.parseDouble(sc.nextLine());

		String descricao = "";
		Diretor diretor = cadastrarDiretor();
		ArrayList atores = cadastrarAtor();
		
		Filme filme = new Filme(nome, data, orcamento, descricao, diretor);
		
		listaFilmes.add(filme);	
	}
	
	public Diretor cadastrarDiretor() {
		return null;
	}

	// (usar um while para cadastrar até o usuário não querer mais)
	public ArrayList<Ator> cadastrarAtor() {
		return null;
	}
	
	public void buscarNomeFilme(String nome){}

	public static void listarFilmes() {}
	public static void listarAtores() {}
	public static void listarDiretores(){}

		boolean encontrado = false;
		for (Filme filme : listaFilmes) {
			if (filme.getNome().equalsIgnoreCase(nomeBusca)) {
				//METODO DO GUSTAVO
				encontrado = true;
				break;
			}
		}
		if (encontrado == false) {
			System.out.println("Não encontrado.");
		}
	}
}
