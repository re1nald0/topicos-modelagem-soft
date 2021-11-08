package mediaplayer.players;

import mediaplayer.contracts.IMP3Player;

public class MP3Player implements IMP3Player {
    private String diretorio;

    public MP3Player(String diretorio) {
        this.diretorio = diretorio;
    }

    @Override
    public void playMusic() {
        System.out.println("Executando MP3 player.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando MP3 player.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando MP3 player.");
    }

	@Override
	public String toString() {
		return "MP3Player [diretorio=" + diretorio + "]";
	}
}
