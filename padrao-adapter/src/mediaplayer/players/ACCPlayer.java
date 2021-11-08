package mediaplayer.players;

import mediaplayer.contracts.IACCPlayer;

public class ACCPlayer implements IACCPlayer {
    private String diretorio;

    public ACCPlayer(String diretorio) {
        this.diretorio = diretorio;
    }

    @Override
    public void playSong() {
        System.out.println("Executando ACC player.");
    }

    @Override
    public void holdSong() {
        System.out.println("Parando ACC player.");
    }

    @Override
    public void finishSong() {
        System.out.println("Finalizando ACC player.");
    }

	@Override
	public String toString() {
		return "ACCPlayer [diretorio=" + diretorio + "]";
	}
}
