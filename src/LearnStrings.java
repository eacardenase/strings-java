public class LearnStrings {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "Banana";

        // compares alphabetically
        System.out.println(firstWord.compareTo(secondWord)); // -1
        System.out.println(secondWord.compareTo(firstWord)); // 1

        System.out.println(firstWord.compareTo("apple")); // -32
        System.out.println(firstWord.compareToIgnoreCase("apple")); // 0
    }

    public static Integer compareToIgnoreCaseStrip(String text1, String text2) {
        String lowerCaseText1 = text1.strip().toLowerCase();
        String lowerCaseText2 = text2.strip().toLowerCase();

        return lowerCaseText1.compareTo(lowerCaseText2);
    }
}
