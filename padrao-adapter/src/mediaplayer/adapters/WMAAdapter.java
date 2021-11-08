package mediaplayer.adapters;

import mediaplayer.contracts.IMP3Player;
import mediaplayer.players.WMAPlayer;

public class WMAAdapter implements IMP3Player {
    private WMAPlayer wmaPlayer;

    public WMAAdapter(WMAPlayer wmaPlayer) {
        this.wmaPlayer = wmaPlayer;
    }

    @Override
    public void playMusic() {
        this.wmaPlayer.run();
    }

    @Override
    public void pauseMusic() {
        this.wmaPlayer.pause();
    }

    @Override
    public void stopMusic() {
        this.wmaPlayer.stop();
    }
}
