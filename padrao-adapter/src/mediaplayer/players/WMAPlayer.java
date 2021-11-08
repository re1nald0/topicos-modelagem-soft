package mediaplayer.players;

import mediaplayer.contracts.IWMAPlayer;

public class WMAPlayer implements IWMAPlayer {
    private String diretorio;

    public WMAPlayer(String diretorio) {
        this.diretorio = diretorio;
    }

    @Override
    public void run() {
        System.out.println("Executando WMA player.");
    }

    @Override
    public void pause() {
        System.out.println("Pausando WMA player.");
    }

    @Override
    public void stop() {
        System.out.println("Parando WMA player.");
    }

	@Override
	public String toString() {
		return "WMAPlayer [diretorio=" + diretorio + "]";
	}
}
