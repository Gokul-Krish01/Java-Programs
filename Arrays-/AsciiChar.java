public class AsciiChar {
    public static void main(String[] args) {
        int[] asciiValues = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        for (int value : asciiValues) {
            System.out.print((char) value);
        }
    }
}
