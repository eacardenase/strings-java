public class LearnStrings {

    public static String split(String text) {
        return text.replace(" ", "");
    }

    public static void main(String[] args) {
        String firstName = "  Edwin  ";

        System.out.format("'%s'", firstName);
        System.out.println();
        System.out.format("'%s'", firstName.strip());
        System.out.println();
        System.out.format("'%s'", firstName.stripLeading());
        System.out.println();
        System.out.format("'%s'", firstName.stripTrailing());
        System.out.println();
        System.out.format("'%s'", firstName.trim());

        System.out.println();

        String myLongText = """
                        first line
                                    second line
                third line
                """;

        System.out.println(myLongText);
        System.out.format("'%s'",myLongText.stripIndent());
    }
}
