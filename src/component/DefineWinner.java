package component;

import model.Card;
import model.CardDeck;

import java.util.List;

public class DefineWinner {

    public DefineWinner() {}

    public String execute(List<Card> firstFullHandCards, List<Card> secondFullHandCards) {
        IdentifyRank identifyRank = new IdentifyRank();

        Integer sublength = 5;
        Integer listSize = 5000;

        Integer firstHandCounter = 0;
        Integer secondHandCounter = 0;

        for(int i = 0; i < listSize; i = i + sublength) {
            //lists of 5 cards each
            CardDeck firstHandSublist = new CardDeck(firstFullHandCards.subList(i, i + Math.min(sublength, firstFullHandCards.size() - i)));
            CardDeck secondHandSublist = new CardDeck(secondFullHandCards.subList(i, i + Math.min(sublength, secondFullHandCards.size() - i)));

            //identify firstHandSublist e secondHandSublist ranks
            identifyRank.execute(firstHandSublist, secondHandSublist, firstHandCounter, secondHandCounter);

        }

        return firstHandCounter > secondHandCounter == true ?
                "Winner: 1st player with " + firstHandCounter + " points!" :
                "Winner : 2nd player with " + secondHandCounter + " points!";

    }

}
