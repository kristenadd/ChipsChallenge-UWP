package chipschallenge.blockreactions;

import chipschallenge.Block;
import chipschallenge.Game;
import chipschallenge.Inventory.Key;

/**
 *
 * @author patrik
 */
public class YellowLockTo extends BlockReaction {

    private YellowLockTo() {}
    private static YellowLockTo mInstance = null;
    public static synchronized YellowLockTo getInstance() {
        if(mInstance == null)
            mInstance = new YellowLockTo();
        return mInstance;
    }

    public void react(Block moving, Block standing) {
        Game.getInstance().getInventory().useKey(Key.YELLOW);
        standing.destroy();
    }

    public boolean canMove(Block moving, Block standing) {
        return isChip(moving) &&
               Game.getInstance().getInventory().hasKey(Key.YELLOW);
    }

}
