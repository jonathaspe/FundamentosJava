// 1 - pacote
package fundamentos;

// 2 - bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // Criamos o objeto para ler uma entrada no console

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0;

        System.out.println("Cálculo desejado");
        System.out.println("(1) - Área do Quadrado");
        System.out.println("(2) - Área do Retângulo");
        System.out.println("(3) - Área do Triângulo");
        System.out.println("(4) - Área do Círculo");

        opcao = entrada.nextLine(); // Leitura da opção
        switch (opcao){
            case "1":
                calcularAreaDoQuadrado();
                break;
            case "2":
                calcularAreaDoRetangulo();
                break;
            case "3":
                calcularAreaDoTriangulo();
                break;
            case "4":
                calcularAreaDoCirculo();
                break;
            default:
                System.out.println("Opção inválida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área é de " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado(){
        int lado; // tamanho do lado do quadrado
        int area; // área do quadrado a ser calculada

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado
        area = lado * lado; // área do quadrado
        return area;
    }

}
