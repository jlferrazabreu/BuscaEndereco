package br.com.jorge.buscaendereco.models;

public record Endereco (String cep,String logradouro,
                        String bairro, String localidade, String uf){
}
