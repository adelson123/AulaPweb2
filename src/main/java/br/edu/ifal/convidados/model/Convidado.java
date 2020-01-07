package br.edu.ifal.convidados.model;

public class Convidado {
    private String nome;
    private Integer quantidadeDeAcompanhantes;

    public Convidado(){

    }

    public Convidado(String nome, Integer quantidadedeAcompanhantes){
        this.nome = nome;
        this.quantidadeDeAcompanhantes = quantidadedeAcompanhantes;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getQuantidadeDeAcompanhantes(){
        return quantidadeDeAcompanhantes;
    }

    public void quantidaDeAcompanhantes(Integer quantidadeDeAcompanhantes){
        this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
    }
}
