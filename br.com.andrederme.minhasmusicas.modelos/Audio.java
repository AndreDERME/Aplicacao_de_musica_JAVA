package br.com.andrederme.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int TotalReproducoes;
    private int TotalCurtidas;
    private int Classificacao;
     
     public String getTitulo(){
        return titulo;
     }

     public void setTitulo(String Titulo){
        this.titulo = titulo;
     }

     public int getTotalReproducoes(){
        return TotalReproducoes;
     }

     public int getTotalCurtidas(){
        return TotalCurtidas;
     }

     public int getClassificacao(){
        return Classificacao;
     }

     public void curte(){
        this.TotalCurtidas++;
     }

     public void reproduz(){
        this.TotalReproducoes++;
     }
}