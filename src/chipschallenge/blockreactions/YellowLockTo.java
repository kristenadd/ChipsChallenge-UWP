package chipschallenge.blockreactions;

import chipschallenge.Block;
import chipschallenge.Game;
import chipschallenge.Inventory.Key;
import chipschallenge.SoundPlayer.sounds;

/**
 *
 * @author patrik
 */
public class YellowLockTo extends BlockReaction {

    private YellowLockTo() {
    }
    private static YellowLockTo mInstance = null;

    public static synchronized YellowLockTo getInstance() {
        if (mInstance == null) {
            mInstance = new YellowLockTo();
        }
        return mInstance;
    }

    public void react(Block moving, Block standing) {
        useKey(Key.YELLOW);
        standing.destroy();
        sound().playSound(sounds.DOOR);
    }

    public boolean canMove(Block moving, Block standing) {
        return moving.isChip() && hasKey(Key.YELLOW);
    }
}
