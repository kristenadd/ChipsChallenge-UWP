package chipschallenge;

import chipschallenge.gui.GUI;
import chipschallenge.tickbehaviors.ChipTickBehavior;

public class Main {

    public static void main(String[] args) {
        int startLevel = 1;
        if (args.length > 0) {
            try {
                startLevel = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                startLevel = 1;
            }
        }
        Game g = Game.getInstance();
        g.setLevelFactory(MicrosoftLevelFactory.getInstance());
        g.setBlockFactory(MicrosoftBlockFactory.getInstance());
        GUI Gui = GUI.getInstance();
        Gui.addKeyListener(ChipTickBehavior.getInstance());
        g.nextLevel(20);
    }
}
