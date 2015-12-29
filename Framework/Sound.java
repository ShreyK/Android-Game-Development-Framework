package shreyk.god.Framework;

import android.media.SoundPool;

/**
 * Created by Shrey on 12/16/2015.
 */
public class Sound {
    int soundId;
    SoundPool soundPool;

    public Sound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    public void dispose() {
        soundPool.unload(soundId);
    }
}
