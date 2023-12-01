package Pessoa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Metodos {

	public Pessoas[] Cadastrar(Pessoas[] pessoa) throws IOException {
		int i;
		String fileName = "ArquivoPessoa.txt";
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
		
		for(i=0; i<3; i++) {
			pessoa[i].nomePessoa = JOptionPane.showInputDialog("Informe o seu nome: ");
			gravar.write(pessoa[i].nomePessoa);
			gravar.newLine();
			pessoa[i].idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			gravar.write(Integer.toString(pessoa[i].idadePessoa));
			gravar.newLine();
			pessoa[i].corDosOlhosPessoa =  JOptionPane.showInputDialog("Informe a cor de seus olhos: ");
			gravar.write(pessoa[i].corDosOlhosPessoa);
			gravar.newLine();
		}
		gravar.close();
		return pessoa;
	}

	public void Mostrar(Pessoas[] pessoa) {
		int i;
		for(i=0; i<3; i++) {
			System.out.println("Olá meu nome é " + pessoa[i].nomePessoa + " tenho olhos " + pessoa[i].corDosOlhosPessoa + " e " + pessoa[i].idadePessoa + " anos de idade");
			System.out.println("________________________________________________________________________________________________________");
		}
		
	}

	public void Leitura(Pessoas[] pessoa) throws IOException {
		int i;
		String fileName = "ArquivoPessoa.txt";
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		
		for(i=0; i<3; i++) {
			pessoa[i].nomePessoa = ler.readLine();
			pessoa[i].idadePessoa = Integer.parseInt(ler.readLine());
			pessoa[i].corDosOlhosPessoa = ler.readLine();
		}
		ler.close();
	}

}
