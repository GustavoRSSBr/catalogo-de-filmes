package controller;
import java.util.ArrayList;
import java.util.Scanner;

import model.Ator;
import model.Diretor;
import model.Filme;

public class ControleFilme {

	Scanner sc = new Scanner(System.in);

	private ArrayList<Filme> listaFilmes = new ArrayList<>();

	public void cadastrarFilme() {

		System.out.print("Digite o nome do filme: ");
		String nome = sc.nextLine();

		System.out.print("Digite a data de lançamento: ");
		String data = sc.nextLine();

		System.out.print("Digite o orçamento do filme: ");
		double orcamento = Double.parseDouble(sc.nextLine());

		System.out.print("Digite a descrição do filme: ");
		String descricao = sc.nextLine();

		Diretor diretor = cadastrarDiretor();

		ArrayList<Ator> atores = cadastrarAtores();

		Filme filme = new Filme(nome, data, orcamento, descricao, diretor, atores);

		listaFilmes.add(filme);
		
		System.out.println("Filme cadastrado com sucesso!");
		System.out.println(filme.exibirInformacao());
	}

	public Diretor cadastrarDiretor() {
		System.out.print("Digite o nome do diretor: ");
		String nomeDiretor = sc.nextLine();
		Diretor diretor = new Diretor(nomeDiretor);
		return diretor;
	}

	public ArrayList<Ator> cadastrarAtores() {
		ArrayList<Ator> listaAtores = new ArrayList<>();
		while (true) {
			System.out.println("------Cadastro de Atores-----");
			System.out.print("Digite o nome do ator: ");
			String nomeAtor = sc.nextLine();
			System.out.print("Digite o nome de seu personagem: ");
			String nomePersonagem = sc.nextLine();
			Ator novoAtor = new Ator(nomeAtor, nomePersonagem);
			listaAtores.add(novoAtor);

			System.out.print("Deseja cadastrar mais um ator? (S/N): ");
			String resposta = sc.nextLine();
			if (resposta.equalsIgnoreCase("N")) {
				return listaAtores;
			}
		}
		
	}

	public void buscarNomeFilme() {
		System.out.print("Digite o nome do filme: ");
		String nomeBusca = sc.nextLine();
		boolean encontrado = false;
		for (Filme f : listaFilmes) {
			if (f.getNome().equalsIgnoreCase(nomeBusca)) {
				System.out.print(f.exibirInformacao());
				encontrado = true;
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("Filme não encontrado.");
		}
	}

	public void listarFilmes() {
		if(listaFilmes.size() == 0) {
			System.out.println("Nenhum filme cadastrado!");
		}
		for(Filme filmes : listaFilmes) {
			System.out.println(filmes.exibirInformacao());
			System.out.println("--------------------------------");
		}
	}

	public static void listarAtores() {
		System.out.println("\nSistema em construção, funcionalidade não implementada.\n");
	}

	public static void listarDiretores() {
		System.out.println("\nSistema em construção, funcionalidade não implementada.\n");
	}
}
