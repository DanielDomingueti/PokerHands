import component.DefineWinner;
import component.ReadTxtFile;
import model.Card;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //read txt file - separate each line into two different lists of 5 cards - new model.Card(value, suit) separated by blank spaces
        ReadTxtFile readTxtFile = new ReadTxtFile();
        List<List<Card>> firstAndSecondHandCards = readTxtFile.execute();

        //identify ranks of each deck and comes up with winner
        DefineWinner defineWinner = new DefineWinner();
        String winnerValue = defineWinner.execute(firstAndSecondHandCards.get(0), firstAndSecondHandCards.get(1));

        System.out.println(winnerValue);

    }
}