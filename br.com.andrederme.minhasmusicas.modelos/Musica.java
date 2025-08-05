package br.com.andrederme.minhasmusicas.modelos;

public class Musica extends Audio{
    private String Album;
    private String Cantor;
    private String Genero;

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String Cantor){
        this.cantor = cantor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String Genero){
        this.genero = genero;
    }

    @Override 
    public int getClassificacao(){
        if (this.getTotalReproducoes() > 200 ) {
            return 10;
        }
        else {
            return 7;
        }
    }

}