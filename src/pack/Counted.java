package pack;

public class Counted {
    private static int counter=0;

    public Counted() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
