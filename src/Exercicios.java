import java.util.Scanner;

public class Exercicios {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Você possui as seguintes opções:");
		System.out.println (" 1 - Conversão de temperatura \n 2 - Altura e media \n 3 - Média salarial \n 4 - Quantidade de azuleijos \n 5 - Valor do volume de uma lata de oleo \n 6 - cavalos necessarios.\n");
		System.out.print ("qual opção você deseja:");
		
		int opcoes = sc.nextInt ();
		
		switch (opcoes) {
			
			case 1:
				System.out.println ("Você selecionou Conversão de temperatura.\n");
				System.out.println ("Digite a quantidade de graus Celsius");
				Temperatura temp;
				temp = new Temperatura ();
				temp.C = sc.nextDouble ();
				temp.Kelvin ();
				temp.Fahrenheit ();
				temp.Rankine ();
				temp.Reaumur ();
				break;
            
            case 2:
                System.out.println("Você selecionou Altura e média de homens e mulheres.\n");
                HomensEMulheres[] HM = new HomensEMulheres[4];
                int quantidadeMulheres = 0;
                
                for (int i = 0; i < 4; i++) {
                    HM[i] = new HomensEMulheres();
                    System.out.println("Escolha o sexo:");
                    System.out.println(" 1 - para mulheres\n 2 - para homens");
                    HM[i].sexo = sc.nextInt();
                    System.out.println("Agora digite a altura em Centímetros dessa pessoa");
                    HM[i].Altura = sc.nextDouble();
                    
                    if (HM[i].sexo == 1) {
                        quantidadeMulheres++;
                    } else if (HM[i].sexo == 2) {
                        HM[i].QHomens++;
                        HM[i].somaH += HM[i].Altura;
                    } else {
                        System.out.println("A opção digitada não existe.");
                    }
                    
                    if (i == 0 || HM[i].Altura > HM[i].Maior) {
                        HM[i].Maior = HM[i].Altura;
                    }
                    if (i == 0 || HM[i].Altura < HM[i].Menor) {
                        HM[i].Menor = HM[i].Altura;
                    }
                }
                
                HM[0].Altura();
                HM[0].MediaAltura();
                HM[0].NumeroMulheres(quantidadeMulheres);
                break;
            
            
            case 3:
				System.out.println ("Você selecionou Madia Salarial.\n");
				System.out.println ("Digite o salario de 4 funcionarios:\n");
				MediaSalarial media = new MediaSalarial ();
				media.Valor (media.texto[0]);
				media.n1 = sc.nextDouble ();
				media.Valor (media.texto[1]);
				media.n2 = sc.nextDouble ();
				media.Valor (media.texto[2]);
				media.n3 = sc.nextDouble ();
				media.Valor (media.texto[3]);
				media.n4 = sc.nextDouble ();
				media.Media ();
				break;
			
			case 4:
				Parede parede = new Parede ();
				System.out.println ("Você selecionou quantidade de azulejos. \n");
				System.out.println ("Qual a altura da parede");
				parede.Ap = sc.nextDouble ();
				System.out.println ("Qual a largura da parede:");
				parede.Lp = sc.nextDouble ();
				System.out.println ("Qual a altura do ajulejo:");
				parede.Ha = sc.nextDouble ();
				System.out.println ("Qual a largura do azulejo:");
				parede.La = sc.nextDouble ();
				parede.Quantidade ();
				break;
			
			case 5:
				LataOleo volume = new LataOleo ();
				System.out.println ("Você selecionou a opção Valor do volume da Lata de Oleo.\n");
				System.out.println ("Digite o valor da altura em centimetros  da lata de óleo:");
				volume.A = sc.nextFloat ();
				System.out.println ("Agora digite o valor do raio em centimetros da lata de óleo:");
				volume.R = sc.nextFloat ();
				volume.ValorLata ();
				break;
			
			case 6:
				Cavalos cavalos = new Cavalos ();
				System.out.println ("você selecionou a opção cavalos necessarios.\n");
				System.out.println ("Qual o peso em massa(quilogramas) do seu produto?");
				cavalos.massa = sc.nextDouble ();
				System.out.println ("Qual a altura do seu produto?");
				cavalos.altura = sc.nextDouble ();
				System.out.println ("Qual o seu prazo de entrega:");
				cavalos.tempo = sc.nextDouble ();
				cavalos.Quantidade ();
		}
	}
}
