import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {
    public static void main(String[] args) {
        String people = """
            Flinstone, Fred, 1/1/1900
            Rubble, Barney, 2/2/1905
            Flinstone, Wilma, 3/3/1910
            Rubble, Betty, 4/4/1915
            """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(people);

        matcher.find(); // find strings that match the regex

        System.out.println(matcher.group("firstName"));
        System.out.println(matcher.group("lastName"));
        System.out.println(matcher.group("dob"));
        System.out.println(matcher.start());
        System.out.println(matcher.end());
    }
}
