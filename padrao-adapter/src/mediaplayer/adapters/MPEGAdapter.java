package mediaplayer.adapters;

import mediaplayer.contracts.IMP3Player;
import mediaplayer.players.MPEGPlayer;

public class MPEGAdapter implements IMP3Player {
    private MPEGPlayer mpegPlayer;

    public MPEGAdapter(MPEGPlayer mpegPlayer) {
        this.mpegPlayer = mpegPlayer;
    }

    @Override
    public void playMusic() {
        this.mpegPlayer.runVideo();
    }

    @Override
    public void pauseMusic() {
        this.mpegPlayer.holdVideo();
    }

    @Override
    public void stopMusic() {
        this.mpegPlayer.finishVideo();
    }
}
