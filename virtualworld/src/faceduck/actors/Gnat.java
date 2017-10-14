package faceduck.actors;

import faceduck.custom.Actionable;
import faceduck.custom.util.*;

/**
 * This is a simple implementation of a Gnat. It never loses energy and moves in
 * random directions.
 */
public class Gnat extends Actionable {
	private static final int MAX_ENERGY = 0;
	private static final int VIEW_RANGE = 1;
	private static final int BREED_LIMIT = 0;
	private static final int COOL_DOWN = 0;

	public Gnat(int size) {
        super(0);
    }

	@Override
	public int getMaxEnergy() {
		return MAX_ENERGY;
	}

	@Override
	public int getBreedLimit() {
		return BREED_LIMIT;
	}

	@Override
	public int getViewRange() {
		return VIEW_RANGE;
	}

	@Override
	public int getCoolDown() {
		return COOL_DOWN;
	}

    @Override
    protected double judge(Actors actor) {
	    switch (actor) {
            case GRASS:
            case GNAT:
            case RABBIT:
            case FOX:
            case GARDENER:
            case EMPTY:
            default:
                return Recognizable.IRRELEVANT.getValue();
        }
    }
}
