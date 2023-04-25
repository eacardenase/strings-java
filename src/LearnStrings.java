public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "banana";  // string literal
        String anotherFruit = "banana"; // points to the same reference as 'fruit'
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli"); // don't point to vegetable reference

//        System.out.println(fruit == anotherFruit);
//        System.out.println(vegetable == anotherVegetable);

        String text1 = "this is my text1";
        String text2 = "this is my text2";

        String finalString = new StringBuilder(text1.length() + text2.length() + 1)
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();

        System.out.println(finalString);

        String otherFinalString = new StringBuffer()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();

        System.out.println(otherFinalString);
    }
}
