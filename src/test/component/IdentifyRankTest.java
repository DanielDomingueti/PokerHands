package test.component;

import component.IdentifyRank;
import model.Counter;
import model.Hand;

import java.util.ArrayList;
import java.util.List;

public class IdentifyRankTest {
    public static void main(String[] args) {
        IdentifyRankTest test = new IdentifyRankTest();
        test.testCountTie(test.createLowHand(), test.createLowHand());
        test.testCountFirstHandWinner(test.createHighHand(), test.createLowHand());
        test.testCountSecondHandWinner(test.createLowHand(), test.createHighHand());
    }

    public void testCountTie(Hand firstHand, Hand secondHand) {
        IdentifyRank identifyRank = new IdentifyRank();
        Counter counter = identifyRank.execute(firstHand, secondHand);
        System.out.println("Should be both zero: " + counter);
    }

    public void testCountFirstHandWinner(Hand firstHand, Hand secondHand) {
        IdentifyRank identifyRank = new IdentifyRank();
        Counter counter = identifyRank.execute(firstHand, secondHand);
        System.out.println("First hand should win: " + counter);
    }

    public void testCountSecondHandWinner(Hand firstHand, Hand secondHand) {
        IdentifyRank identifyRank = new IdentifyRank();
        Counter counter = identifyRank.execute(firstHand, secondHand);
        System.out.println("Second hand should win: " + counter);
    }



    public Hand createLowHand() {
        List<Hand.Value> modifiableValues = new ArrayList<>();
        modifiableValues.add(new Hand.Value(2, 1));
        modifiableValues.add(new Hand.Value(3, 1));
        modifiableValues.add(new Hand.Value(4, 1));
        modifiableValues.add(new Hand.Value(5, 1));
        modifiableValues.add(new Hand.Value(6, 1));

     return new Hand(modifiableValues, 5);
    }

    public Hand createHighHand() {
        List<Hand.Value> modifiableValues = new ArrayList<>();
        modifiableValues.add(new Hand.Value(10, 1));
        modifiableValues.add(new Hand.Value(11, 1));
        modifiableValues.add(new Hand.Value(12, 1));
        modifiableValues.add(new Hand.Value(13, 1));
        modifiableValues.add(new Hand.Value(14, 1));

        return new Hand(modifiableValues, 5);
    }

}
