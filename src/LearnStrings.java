public class LearnStrings {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";

//        System.out.println(text1 + " " + text2 + " hello");
//        System.out.println(text1.concat(text2));

        // recommended use within for loops
        String finalString = new StringBuilder(text1.length() + text2.length() + 1)
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();

        System.out.println(finalString);

        // it's older than StringBuilder, and it's thread safe
        // but comes at the cost of performance
        String otherFinalString = new StringBuffer()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();

        System.out.println(otherFinalString);

        // \n added intentionally
        System.out.format("%s %s\n", text1, text2);

        String oneMoreFinalString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreFinalString);
    }
}
