import component.DefineHandCounts;
import component.implementation.DefineHandCountsImpl;

public class Main {
    public static void main(String[] args) {
        DefineHandCounts defineHandCounts = new DefineHandCountsImpl();
        String winner = defineHandCounts.execute();
        System.out.println(winner);
    }
}