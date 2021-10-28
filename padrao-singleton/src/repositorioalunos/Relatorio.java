package repositorioalunos;

import java.util.List;
import java.util.Scanner;

public class Relatorio {
	
	public static void main(String[] args) {
		int opcao;
		String nome, rg;
		double mediaFinal;
		
		ListaAlunos myLista = null;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Escolha a opcao desejada");
			System.out.println("1 - Adicionar um aluno");
			System.out.println("2 - Remover um aluno pelo seu RG");
			System.out.println("3 - Buscar um aluno pelo seu RG");
			System.out.println("4 - Exibir a lista de alunos");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
				case 1: {
					System.out.println("Digite o nome do aluno");
					nome = input.nextLine();
					
					System.out.println("Digite o rg do aluno");
					rg = input.nextLine();
					
					System.out.println("Digite a media final obtida pelo aluno");
					mediaFinal = Double.parseDouble(input.nextLine());
					
					myLista = ListaAlunos.getInstance();
					myLista.adicionarAluno(nome, rg, mediaFinal);
					
					break;
				}
				case 2: {
					System.out.println("Digite o rg do aluno que deseja remover");
					rg = input.nextLine();
					
					myLista = ListaAlunos.getInstance();
					myLista.removerAluno(rg);
					
					break;
				}
				case 3: {
					System.out.println("Digite o rg do aluno que deseja consultar");
					rg = input.nextLine();
					
					myLista = ListaAlunos.getInstance();
					Aluno aluno = myLista.buscarAluno(rg);
					
					if(aluno != null) {
						System.out.println("DADOS DO ALUNO");
						System.out.println("Nome: " + aluno.getNome());
						System.out.println("RG: " + aluno.getRg());
						System.out.println("Media Final : " + aluno.getMediaFinal());
					} else {
						System.out.println("Aluno nao encontrado");
					}
					
					break;
				}
				case 4: {
					myLista = ListaAlunos.getInstance();
					List<Aluno> listaAlunos = myLista.obterListaAlunos();
					
					if(listaAlunos.size() > 0) {
						System.out.println("LISTA DE ALUNOS");
						System.out.println("-------------------------");
						for(int i = 0; i < listaAlunos.size(); i++) {
							System.out.println("DADOS DO ALUNO" + i);
							System.out.println("Nome: " + listaAlunos.get(i).getNome());
							System.out.println("RG: " + listaAlunos.get(i).getRg());
							System.out.println("Media Final : " + listaAlunos.get(i).getMediaFinal());
							System.out.println("-------------------------");
						}
					} else {
						System.out.println("Nao ha alunos cadastrados");
					}
					
					break;
				}
				case 0: {
					System.out.println("Saindo...");
					break;
				}
				default:
					System.out.println("Opção Inválida");
			}
			
		} while(opcao != 0);
		
		input.close();
	}
}
