package mediaplayer.adapters;

import mediaplayer.contracts.IMP3Player;
import mediaplayer.players.AVIPlayer;

public class AVIAdapter implements IMP3Player {
    private AVIPlayer aviPlayer;

    public AVIAdapter(AVIPlayer aviPlayer) {
        this.aviPlayer = aviPlayer;
    }

    @Override
    public void playMusic() {
        this.aviPlayer.playMovie();
    }

    @Override
    public void pauseMusic() {
        this.aviPlayer.pauseMovie();
    }

    @Override
    public void stopMusic() {
        this.aviPlayer.stopMovie();
    }
}
