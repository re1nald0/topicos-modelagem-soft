package mediaplayer.adapters;

import mediaplayer.contracts.IMP3Player;
import mediaplayer.players.ACCPlayer;

public class ACCAdapter implements IMP3Player {
    private ACCPlayer accPlayer;

    public ACCAdapter(ACCPlayer accPlayer) {
        this.accPlayer = accPlayer;
    }

    @Override
    public void playMusic() {
        this.accPlayer.playSong();
    }

    @Override
    public void pauseMusic() {
        this.accPlayer.holdSong();
    }

    @Override
    public void stopMusic() {
        this.accPlayer.finishSong();
    }
}
