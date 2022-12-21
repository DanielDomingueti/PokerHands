package component;

import model.Card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadTxtFile {

    public ReadTxtFile() {}

    public List<List<Card>> execute() {

        List<Card> firstHandCards = new ArrayList<>();
        List<Card> secondHandCards = new ArrayList<>();

        try {

            URL url = new URL("https://projecteuler.net/project/resources/p054_poker.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = bufferedReader.readLine();

            //CHANGE NULL CHECK
            while (line != null) {
                String cards[] = line.split(" ");

                int i = 0;
                for(String card: cards) {
                    Card cardObj = new Card(String.valueOf(card.charAt(0)), String.valueOf(card.charAt(1)));

                    if (i < 5) {
                        firstHandCards.add(cardObj);
                        i++;
                    } else {
                        secondHandCards.add(cardObj);
                    }
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return List.of(firstHandCards, secondHandCards);
    }

}
