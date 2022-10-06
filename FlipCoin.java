// Flip Coin and print percentage of Heads and Tails

public class FlipCoin {
    public static void main(String[] args) {
        //int Head, Tail;
        double value = Math.random() * 10 % 2;
        System.out.println(value);
        if (value < 0.5) {
            System.out.println("Tail");
        } else {
            System.out.println("Head");
        }
    }
}