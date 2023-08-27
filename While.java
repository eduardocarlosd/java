import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliaca = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliaca += nota;
                totalDeNotas++;
            }
        }
            System.out.println("Média de avaliações: " + mediaAvaliaca / totalDeNotas + " estrelas");
        }
    }

