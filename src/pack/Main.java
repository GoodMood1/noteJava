package pack;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            Counted count = new Counted();
        }
        System.out.println(Counted.getCounter());
    }
}
