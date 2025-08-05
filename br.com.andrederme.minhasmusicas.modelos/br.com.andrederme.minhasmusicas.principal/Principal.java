package br.com.minhasmusicas.principa;

public class Principal{
    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("forever");
        minhaMusica.setCantor ("kiss");
        
        
        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("Bolhadev");
        meuPodcast.setApresentador("Marcos mendes")
    }

    for (int i = 0; i < 5000; i++){
        meuPodcast.reproduz;
    }

    for (int i = 0; i < 5000; i++){
        meuPodcast.curte();
    }

    minhasPreferidas preferidas = new minhasPreferidas();
    preferidas.inclui(meuPodcast);
    preferidas.inclui(minhaMusica);
}