import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do local: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Informe a largura do local: ");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.mudarValorLados(comprimento, largura);

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        double areaPiso = 2.5; // valor hipotetico
        double comprimentoRodape = 0.50; // valor hipotetico

        int quantidadePisos = (int) Math.ceil(area / areaPiso);
        int quantidadeRodapes = (int) Math.ceil(perimetro / comprimentoRodape);

        System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

    }

}