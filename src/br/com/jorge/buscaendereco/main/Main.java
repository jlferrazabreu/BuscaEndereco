package br.com.jorge.buscaendereco.main;

import br.com.jorge.buscaendereco.models.Endereco;
import br.com.jorge.buscaendereco.util.ConsultaCep;
import br.com.jorge.buscaendereco.util.GeraArquivo;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ConsultaCep consulta = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o CEP para busca: ");
        var cep = leitura.nextLine();
        try {
            Endereco endereco = consulta.buscaEndereco(cep);
            System.out.println(endereco);
            GeraArquivo gerador = new GeraArquivo();
            gerador.salvaArquviJson(endereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}