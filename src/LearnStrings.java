public class LearnStrings {
    public static void main(String[] args) {
        String text = """
                Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
                Flintstone,Fred,3/3/81,3333 GHI St.,Pear,MO
                """;

        String[] people = text.split("\n");

        System.out.println(people.length); // property
        System.out.println("people".length()); // method

        String[] person = people[0].split(",");

        System.out.println(people[0]);

        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println(person[3]);
    }
}
