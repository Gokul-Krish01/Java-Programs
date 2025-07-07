class Twostring {
    public static void main(String [] args) {
        if (args.length < 2) {
            System.out.println("Provide two strings ");
        }
        String word1 = args[0];
        String word2 = args[1];

        System.out.println(word1 + " Technologies " + word2);
    }
}
