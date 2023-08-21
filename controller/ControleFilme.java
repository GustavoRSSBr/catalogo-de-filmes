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

		System.out.print("\nDigite o nome do filme: ");
		String nome = sc.nextLine();

		System.out.print("Digite a data de lançamento: ");
		String data = sc.nextLine();

		double orcamento = -1;
		do {
			try {
				System.out.print("Digite o orçamento do filme: ");
				orcamento = Double.parseDouble(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Valor inválido! Tente novamente.");
			}
		} while (orcamento == -1);

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
		System.out.print("\nDigite o nome do diretor: ");
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

			String resposta = "N";
			boolean fim = false;
			do {
				System.out.print("Deseja cadastrar mais um ator? (S/N): ");
				resposta = sc.nextLine();
				if (resposta.equalsIgnoreCase("N")) {
					fim = true;
					return listaAtores;
				} else if (resposta.equalsIgnoreCase("S")) {
					fim = false;
					break;
				} else {
					System.out.println("Opção inválida! Tente novamente.");
					fim = false;
				}
			} while (!fim);
		}
	}

	public void buscarNomeFilme() {
		System.out.print("Digite o nome do filme: ");
		String nomeBusca = sc.nextLine();
		boolean encontrado = false;
		for (Filme f : listaFilmes) {
			//if (f.getNome().equalsIgnoreCase(nomeBusca)) {
			if (f.getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
				System.out.print(f.exibirInformacao());
				encontrado = true;
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("\nFilme não encontrado.");
		}
	}

	public void listarFilmes() {
		if(listaFilmes.size() == 0) {
			System.out.println("\nNenhum filme cadastrado!");
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
