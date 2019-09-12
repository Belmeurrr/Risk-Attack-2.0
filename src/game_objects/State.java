package game_objects;

import java.awt.*;

public abstract class State {

    private static State currentState = null;

    public static State getCurrentState() {
        return currentState;
    }


    public static void setCurrentState(State state) {
        currentState = state;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
