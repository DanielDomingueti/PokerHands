package component;

import model.Counter;
import model.Hand;

public interface IdentifyRank {
    Counter execute(Hand firstHand, Hand secondHand);
}
