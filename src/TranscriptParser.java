import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab student grade
                Birthdate:\\s+(?<month>\\d{2})/(?<day>\\d{2})/(?<year>\\d{4}).* # Grab student birthdate
                Gender:\\s+(?<gender>\\w+)\\b.* # Grab student gender
                State\\sID:\\s+(?<stateID>\\d{10})\\b.* # Grab student state id
                Weighted\\)\\s+(?<gpaWeighted>[\\d\\.]+\\d{2})\\b.* # Grab weighted gpa
                Unweighted\\)\\s+(?<gpaUnweighted>[\\d\\.]+\\d{2})\\b.* # Grab unweighted gpa
                """;

        Pattern transcriptPatter = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher transcriptMatcher = transcriptPatter.matcher(transcript);

        if (transcriptMatcher.matches()) {
            System.out.println(transcriptMatcher.group("studentNumber"));
            System.out.println(transcriptMatcher.group("grade"));
            System.out.println(transcriptMatcher.group("month"));
            System.out.println(transcriptMatcher.group("day"));
            System.out.println(transcriptMatcher.group("year"));
            System.out.println(transcriptMatcher.group("gender"));
            System.out.println(transcriptMatcher.group("stateID"));
            System.out.println(transcriptMatcher.group("gpaWeighted"));
            System.out.println(transcriptMatcher.group("gpaUnweighted"));
        }
    }
}
