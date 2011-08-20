package chipschallenge.buttonbehaviors;

import chipschallenge.Block;
import chipschallenge.blockreactions.canMoveNoSlip;
import chipschallenge.blockreactions.CannotMove;

public class TrapBehavior implements ButtonBehavior {

    private TrapBehavior() {
    }
    private static TrapBehavior mInstance = null;

    public static synchronized TrapBehavior getInstance() {
        if (mInstance == null) {
            mInstance = new TrapBehavior();
        }
        return mInstance;
    }

    public void buttonDown(Block listener, Block button) {
        if (button.getType() == Block.Type.BROWNBUTTON) {
            if (listener.getType() == Block.Type.TRAP) {
                listener.setFromReaction(canMoveNoSlip.getInstance());
            }
        }
    }

    public void buttonUp(Block listener, Block button) {
        if (button.getType() == Block.Type.BROWNBUTTON) {
            if (listener.getType() == Block.Type.TRAP) {
                listener.setFromReaction(CannotMove.getInstance());
            }
        }
    }
}
