package filme;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleFilme {
	
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Filme> listaFilmes = new ArrayList<>();
	
	public Filme CadastrarFilme() {
		
		System.out.print("Digite o nome do filme: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite a data de lançamento: ");
		String data = sc.nextLine();
		
		System.out.print("Digite o orçamento do filme: ");
		double orcamento = Double.parseDouble(sc.nextLine());
		
		//Diretor diretor = cadastrarDiretor();
		//List Autores = cadastrarAutores;
		
		
	}
	
	//public Diretor cadastrarDiretor() { 
	//}
	
	

}
