package Pessoa;

public class Pessoas {

	String nomePessoa;
	int idadePessoa;
	String corDosOlhosPessoa;
	
	Pessoas(){
		this("", 0, "");
	}

	public Pessoas(String nome, int idade, String olhos) {
		nomePessoa = nome;
		idadePessoa = idade;
		corDosOlhosPessoa = olhos;
	}
}
