import component.DefineHandCounts;

public class Main {
    public static void main(String[] args) {
        DefineHandCounts defineHandCounts = new DefineHandCounts();
        String winner = defineHandCounts.execute();
        System.out.println(winner);
    }
}