package test.component;

import component.DefineHandCounts;
import component.implementation.DefineHandCountsImpl;

public class DefineHandCountsTest {
    public static void main(String[] args) {
        DefineHandCountsTest test = new DefineHandCountsTest();
        test.testDefineHandCounts();
    }

    public void testDefineHandCounts() {
        DefineHandCounts defineHandCounts = new DefineHandCountsImpl();
        String winnerOutput = defineHandCounts.execute();
        String expectedOutputWinner = "The 1st player has won 376 times, whereas the 2nd player has won 624 times.";
        System.out.println(winnerOutput);

        //equals() between Strings works for equality comparisons without hashCode() and equals() implementation due to "Interning".
        if (winnerOutput.equals(expectedOutputWinner)) {
            System.out.println("Winner output matches the expected result.");
        }
        else {
            System.out.println("Winner output does not match the expected result.");
        }

    }
}
