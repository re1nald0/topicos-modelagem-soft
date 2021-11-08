package mediaplayer;

import java.util.Scanner;

import mediaplayer.adapters.ACCAdapter;
import mediaplayer.adapters.AVIAdapter;
import mediaplayer.adapters.MPEGAdapter;
import mediaplayer.adapters.WMAAdapter;
import mediaplayer.contracts.IMP3Player;
import mediaplayer.players.ACCPlayer;
import mediaplayer.players.AVIPlayer;
import mediaplayer.players.MP3Player;
import mediaplayer.players.MPEGPlayer;
import mediaplayer.players.WMAPlayer;

public class run {
    public static void main(String[] args) {
        int opcao;
        IMP3Player player = null;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Selecione o player que deseja utilizar");
            System.out.println("1 - MP3 Player");
            System.out.println("2 - WMA Player");
            System.out.println("3 - ACC Player");
            System.out.println("4 - AVI Player");
            System.out.println("5 - MPEG Player");
            System.out.println("0 - Sair");
    
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao) {
                case 1 :
                    player = new MP3Player("/musicas");
                    break;
                case 2 :
                    player = new WMAAdapter(new WMAPlayer("/audios"));
                    break;
                case 3 :
                    player = new ACCAdapter(new ACCPlayer("/songs"));
                    break;
                case 4 :
                    player = new AVIAdapter(new AVIPlayer("/movies"));
                    break;
                case 5 :
                    player = new MPEGAdapter(new MPEGPlayer("/videos"));
                    break;
                case 0 :
                    break;
                default:
				    System.out.println("Opção inválida");
            }

            if(opcao != 0) {
                player.playMusic();
                player.pauseMusic();
            }
        } while (opcao != 0);

        player.stopMusic();
        input.close();
    }
}
