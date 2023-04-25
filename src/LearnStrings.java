public class LearnStrings {
    public static void main(String[] args) {
        String myText = "Here's my firf awesome firf text";

        System.out.println(myText);
        System.out.println(myText.replace("firf", "nice")); // it's case-sensitive

        System.out.println(myText.replace('e', 'E'));
    }
}
