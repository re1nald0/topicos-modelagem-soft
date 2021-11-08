package mediaplayer.players;

import mediaplayer.contracts.IMPEGPlayer;

public class MPEGPlayer implements IMPEGPlayer {
    private String diretorio;

    public MPEGPlayer(String diretorio) {
        this.diretorio = diretorio;
    }

    @Override
    public void runVideo() {
        System.out.println("Executando MPEG player.");
    }

    @Override
    public void holdVideo() {
        System.out.println("Pausando MPEG player.");
    }

    @Override
    public void finishVideo() {
        System.out.println("Finalizando MPEG player.");
    }

	@Override
	public String toString() {
		return "MPEGPlayer [diretorio=" + diretorio + "]";
	}
}
