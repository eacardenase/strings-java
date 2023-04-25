public class LearnStrings {
    public static void main(String[] args) {
        String myText = "for score and seven years ago.";
        String firstPart = myText.substring(0, 1).toUpperCase();
        String secondPart = myText.substring(1);

//        String myNewText = firstPart.concat(secondPart);
        String myNewText = new StringBuilder(firstPart)
                .append(secondPart)
                .toString();

        System.out.println(myText);
        System.out.println(myNewText);

    }
}
