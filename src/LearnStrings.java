public class LearnStrings {
    public static void main(String[] args) {
        String firstText = "apple";
        String secondText = "apple";
        StringBuffer thirdText = new StringBuffer("apple");
        StringBuilder fourthText = new StringBuilder("apple");

        System.out.println(firstText.contentEquals(secondText)); // compares not only strings
        System.out.println(firstText.contentEquals(thirdText)); // it also compares char sequences
        System.out.println(firstText.contentEquals(fourthText));
        System.out.println(firstText.equals(secondText)); // compares two strings
    }
}
