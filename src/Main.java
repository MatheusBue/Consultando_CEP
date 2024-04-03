import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GeradorArquivo geradorArquivo = new GeradorArquivo();

        Consulta consultaCep = new Consulta();
        System.out.println("Digite um CEP para ser consultado");
        var cep = scan.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaCep(cep);
            System.out.println(novoEndereco);
            geradorArquivo.geraJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicacao");
        }
    }
}