package br.com.andrederme.minhasmusicas.modelos;

public class minhasPreferidas {

    public void inclui (Audio audio){
        if ( audio.getClassificacao() >= 9 ){
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto" 
            + "é preferido por todos!");
        }
        else {
            System.out.println(audio.getTitulo() + "tambem é considerado o queridinho dde geral")
        }
    }
}