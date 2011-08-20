package chipschallenge.blockreactions;

import chipschallenge.Block;
import chipschallenge.Buttons;
import chipschallenge.SoundPlayer.sounds;

public class RedButtonTo extends NoSlipReaction {

    private RedButtonTo() {
    }
    private static RedButtonTo mInstance = null;

    public static synchronized RedButtonTo getInstance() {
        if (mInstance == null) {
            mInstance = new RedButtonTo();
        }
        return mInstance;
    }

    public void react(Block moving, Block standing) {
        Buttons.redButtonDown(standing);
        sound().playSound(sounds.BUTTON);
    }

    public boolean canMove(Block moving, Block standing) {
        return true;
    }
}
