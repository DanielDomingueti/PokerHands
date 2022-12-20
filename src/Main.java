import java.util.List;

public class Main {
    public static void main(String[] args) {
        //read txt file - separate each line into two different lists of 5 cards - new Card(value, suit) separated by blank spaces
        ReadTxtFile readTxtFile = new ReadTxtFile();
        List<List<Card>> firstAndSecondHandCards = readTxtFile.execute();

        //identify ranks inside first and second list per line
            //identifyRank(List(5)) -> returns the rank, the highest card of the deck (based on value and suit)
                //returns the respective Rank Object -> isHighCard(5), isOnePair(5), and so on
                //Rank Object -> HighCard(List<Card> cards, Card highestCard, rank(1))


        //compare ranks and define which one is the higher -> first++ or second++;
            //if "rank" fields are equal, should compare the "highestCard" field
            //if both hands are equal it's a tie

    }
}