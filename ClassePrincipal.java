package Pessoa;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {
   public static void main(String[] args)throws IOException{
	   Pessoas[] pessoa = new Pessoas[3];
	   Metodos m = new Metodos();
	   int i, opc = 0;
	   
	   for(i=0; i<3; i++) {
		   pessoa[i] = new Pessoas();
	   }
	   
	   while(opc != 9) {
		   
		   opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Cadastrar Pessoas \n 2 - Mostrar Pessoas \n 3 - Leitura \n 9 - Finaliza"));
		   
		   switch(opc) {
		   case 1: pessoa = m.Cadastrar(pessoa);
		           break;
		   case 2: m.Mostrar(pessoa);
		           break;
		   case 3: m.Leitura(pessoa);
		           break;
		   case 9: JOptionPane.showMessageDialog(null, "Finaliza Programa");
		           break;
		   default: JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente: ");
		   }
	   }
   }
}
