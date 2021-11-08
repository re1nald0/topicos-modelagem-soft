package mediaplayer.players;

import mediaplayer.contracts.IAVIPlayer;

public class AVIPlayer implements IAVIPlayer {
    private String diretorio;

    public AVIPlayer(String diretorio) {
        this.diretorio = diretorio;
    }

    @Override
    public void playMovie() {
        System.out.println("Executando AVI player.");
    }

    @Override
    public void pauseMovie() {
        System.out.println("Pausando AVI player.");
    }

    @Override
    public void stopMovie() {
        System.out.println("Parando AVI player.");
    }

	@Override
	public String toString() {
		return "AVIPlayer [diretorio=" + diretorio + "]";
	}
}
