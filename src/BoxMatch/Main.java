package boxMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Rambo", 20, 120, 90, 50);
        Fighter f2 = new Fighter("Mohammed Ali", 20, 120, 100, 50);

        Match match = new Match(f1, f2, 90, 100);
        match.run();
    }
}
