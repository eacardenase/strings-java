public class LearnStrings {
    public static void main(String[] args) {
        String myText = "";
        String anotherText = " ";

        System.out.println(myText.isEmpty()); // true
        System.out.println(myText.isBlank()); // true

        System.out.println(anotherText.isEmpty()); // false
        System.out.println(anotherText.isBlank()); // true because it has whitespace
    }
}
