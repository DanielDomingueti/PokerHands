package test.component;

import component.DefineHandCounts;

public class DefineHandCountsTest {
    public static void main(String[] args) {
        DefineHandCountsTest test = new DefineHandCountsTest();
        test.testDefineHandCounts();
    }

    public void testDefineHandCounts() {
        DefineHandCounts defineHandCounts = new DefineHandCounts();
        String winnerOutput = defineHandCounts.execute();
        String expectedOutputWinner = "The 1st player has won 376 times, whereas the 2nd player has won 624 times.";
        System.out.println(winnerOutput);
        if (winnerOutput.equals(expectedOutputWinner)) {
            System.out.println("Winner output matches the expected result.");
        }
        else {
            System.out.println("Winner output does not match the expected result.");
        }

    }
}
