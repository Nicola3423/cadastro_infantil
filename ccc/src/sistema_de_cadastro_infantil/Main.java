package sistema_de_cadastro_infantil;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Criança> listaCrianca = new ArrayList<>();
		ArrayList<Responsavel> listaResponsavel = new ArrayList<>();
		ArrayList<Medico> listaMedico = new ArrayList<>();
		ArrayList<HistoricoMedico> listaHistorico = new ArrayList<>();
		
		int opcao;
		String opcao2;
		String busca;
		boolean pacienteEncontrado = false;
		int l = 1;
		int k = 1;
		int j = 1;
		
		
		do {
			
			 System.out.printf("===> Menu Prontuário digital Pediátrico <===\n\n");
	           System.out.printf("Escolha uma opção:\n");          
	           System.out.printf("1 - Cadastro de Responsavel e Paciente \n" +
	                             "2 - Exibir Pessoas Cadastradas \n" +
	                             "3 - Buscar criança \n" +
	                             "4 - Cuidados com a Criança \n" +
	                             "5 - Sair\n\n");

	           System.out.printf("Digite a opção desejada: ");
	           opcao = ler.nextInt();
			
	           if(opcao == 1) {
	        	   Responsavel responsavel = new Responsavel();
	        	   
	        	   System.out.print("Digite o nome do Responsavel: ");
	        	   responsavel.setNome(ler.next());
	        	   
		           System.out.print("Digite o email do Responsavel: ");
		           responsavel.setEmail(ler.next());
		           
		           System.out.print("Digite a senha do Responsavel: ");
		           responsavel.setSenha(ler.nextInt());
		           
		           System.out.print("Digite o telefone do Responsavel: ");
		           responsavel.setTelefone(ler.next());
		           
		           listaResponsavel.add(responsavel);
		           
		           Criança crianca = new Criança();
		           
		           System.out.print("Digite o Nome do Paciente: ");
		           crianca.setNome(ler.next());
		           
		           System.out.print("Digite o Data de nascimento do Paciente: ");
		           crianca.setDataNascimento(ler.nextInt());
		           
		           System.out.print("Digite a senha do Paciente: ");
		           crianca.setSenha(ler.nextInt());
		           
		           listaCrianca.add(crianca);
		           
		           Medico medico = new Medico();
		           
		           System.out.print("Digite o Nome do Medico responsavel do Paciente: ");
		           medico.setNome(ler.next());
		           
		           System.out.print("Digite o Email do Medico responsavel do Paciente: ");
		           medico.setEmail(ler.next());
		           
		           System.out.print("Digite a Senha do Medico responsavel do Paciente: ");
		           medico.setEmail(ler.next());
		           
		           System.out.print("Digite a Especialidade do Medico responsavel do Paciente: ");
		           medico.setEspecialidade(ler.next());
		           
		           listaMedico.add(medico);
		           
	    			System.out.print("O paciente possui HistoricoMedico ? (S/N):");
	    			opcao2 = ler.next().toUpperCase();
		           
		           if(opcao2.equals("S")) {
		        	   
		        	   HistoricoMedico historico = new HistoricoMedico();
		        	   
		        	   System.out.print("Digite o diagnostico do Paciente: ");
	    			   historico.setDiagnostico(ler.next());
	    			   
		        	   System.out.print("Digite a data da ultima consulta: ");
		    		   historico.setDataConsulta(ler.next());
		    		   
		        	   System.out.print("Digite a receita da ultima consulta: ");
		    		   historico.setReceita(ler.next());
		    		   
		    		   listaHistorico.add(historico);
		           }else {
		        	  listaHistorico.add(null);
		           }
	           }
	           else if (opcao == 2) {
	        	   	for(Responsavel c: listaResponsavel) {
	        		   System.out.println("Numero do Responsavel:" + l );
	        		   System.out.println(c.exibirResponsavel());
	        		   l = l + 1;
	        	       }
		        	   for(Criança a: listaCrianca) {
		        		   System.out.println("Numero da Criança:" + k );
		        		   System.out.println(a.exibirCrianca());
		        		   k = k + 1;
		        	   }
		        	   for(Medico b: listaMedico) {
		        			   System.out.println("Numero do Medico:" + j );
			        		   System.out.println(b.exibirMedico());
			        		   j = j + 1;
			        	}
		        	 
	           }
	           else if (opcao == 3) {
	        	   System.out.print("Digite o nome do Paciente para buscar: ");
	        	   busca = ler.next();
	        	   
	        	   for(Criança crinca: listaCrianca) {
	        		   if (crinca.getNome().equalsIgnoreCase(busca)) {
	                       System.out.println("\nInformações do paciente encontrado:");
	                       System.out.println("Nome: " + crinca.getNome());
	                       System.out.println("Senha: " + crinca.getSenha());
	                       System.out.println("Data de Nascimento: " + crinca.getDataNascimento());
	                       pacienteEncontrado = true;
	                       break;
	                   }
	        		   else if(pacienteEncontrado == false) {
	        			   System.out.println("\nUsuário não encontrado.");
	        		   }
	        	   }
	           }
	           else if(opcao == 4){
	        	   System.out.print("==================>Cuidados para as Crianças: <============================= \n");
	        	   System.out.printf("Alimentação Saudável:\r\n"
	        	   		+ "Ofereça uma variedade de alimentos nutritivos, incluindo frutas, vegetais, proteínas magras e grãos integrais.\r\n"
	        	   		+ "Evite alimentos ricos em açúcar e gorduras saturadas.\r\n"
	        	   		+ "Introduza alimentos sólidos no momento certo, de acordo com as orientações do pediatra.\r\n"
	        	   		+ "\r\n"
	        	   		+ "Sono Adequado:\r\n"
	        	   		+ "Estabeleça uma rotina de sono regular.\r\n"
	        	   		+ "Certifique-se de que o ambiente de sono seja seguro e confortável.\r\n"
	        	   		+ "Adapte a quantidade de sono conforme a idade da criança.\r\n"
	        	   		+ "\r\n"
	        	   		+ "Atividade Física\r\n"
	        	   		+ "Incentive a prática regular de atividades físicas adequadas à idade.\r\n"
	        	   		+ "Proporcione oportunidades para brincadeiras ao ar livre.\r\n"
	        	   		+ "Limite o tempo de tela e promova um equilíbrio saudável entre atividades sedentárias e ativas.\r\n"
	        	   		+ "\r\n"
	        	   		+ "Vacinação e Check-ups Regulares:\r\n"
	        	   		+ "Mantenha o calendário de vacinação atualizado conforme as orientações do pediatra.\r\n"
	        	   		+ "Realize check-ups regulares para monitorar o crescimento e desenvolvimento da criança.\r\n"
	        	   		+ "A segurança dos dados de saúde do seu filho é nossa principal prioridade. Utilizamos protocolos avançados de criptografia para proteger todas as informações armazenadas no aplicativo, garantindo que apenas usuários autorizados, como médicos e responsáveis legais, tenham acesso. Além disso, estamos totalmente em conformidade com as regulamentações de privacidade, seguindo as melhores práticas do setor para assegurar a confidencialidade e integridade dos dados. Se precisar de mais detalhes sobre nossos protocolos de segurança, sinta-se à vontade para perguntar. \r\n");
	           }
	           else if(opcao == 5) {
	        	   System.out.printf("Prontuário encerrado com sucesso !");
	        	   break;
	           }
		}while((opcao >= 1 ) && (opcao <= 5));
		ler.close();
	}
}