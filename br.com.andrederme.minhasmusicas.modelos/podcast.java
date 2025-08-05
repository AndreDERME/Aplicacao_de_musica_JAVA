package br.com.andrederme.minhasmusicas.modelos

 public class podcast extends Audio{
    private String descricao;
    private String apresentador;

    public String getDescricao(){
        return descricao
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public String getApresentador(){
        return apresentador;
    }

    public void setApresentador (String apresentador){
        this.apresentador = apresentador;
    }

 }