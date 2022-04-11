import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colections_Atividade {
	
	
	public static void main(String[] args) {
		

	List<String> Produtos = new ArrayList<String>();
		
	Scanner leia = new Scanner(System.in);
		
	String produto;
	int opcao = 1;
	
	do {
		
		System.out.println("\nEscolha o que deseja fazer\n\n1°)Adicionar um item"
				+ "\n2°)Remover um item\n3°)Mudar um item\n4°)Mostrar todos os itens"
				+ "\n0°)Encerrar sessão");
		System.out.print("\nOpção: ");
		opcao = leia.nextInt();
		
		
		switch(opcao) {
		
		
		
		case 1:
			leia.nextLine();
			System.out.print("\nAdicionar um item: ");
			produto = leia.nextLine();
			Produtos.add(produto);
			
			break;
		
		case 2:
			System.out.print("\nRemover um item: ");
			leia.nextLine();
			produto = leia.nextLine();
			
			if (Produtos.contains(produto)) {
			
				Produtos.remove(produto);
			
			}else{
			
				System.out.println("\nProduto não existe no estoque");}
			
			break;
		
		case 3:
			leia.nextLine();
			System.out.print("\nMudar um item: ");
			produto = leia.nextLine();
			
			if (Produtos.contains(produto)) {
				
				Produtos.remove(produto);
				
		String	novo;
		
		System.out.print("\nInforme o novo item: ");		
		novo = leia.nextLine();
			Produtos.add(novo);
			
			}else {
				System.out.println("\nProduto não existe...");
			}
			
			
			break;
		
		case 4:
			System.out.print("\nMostrar todos os itens:");
			System.out.println("\n");
			System.out.println(Produtos);
				
			break;
			
			
			
		case 0:
			
			System.out.print("\nFinalizando o programa...");
			
			
			
			break;
		default:
			System.out.println("Opção invalida...");
			System.out.println("\n");
			break;
		
		
		}
	
	
}while(opcao != 0);
	
	}
	
}
