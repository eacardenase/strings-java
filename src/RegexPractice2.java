public class RegexPractice2 {
    public static void main(String[] args) {
//        System.out.println("doggy".matches(".*")); // . represents any character
//        System.out.println("doggy".matches("^.....")); // ^ at the beginning of a line
//        System.out.println("doggy".matches(".....$")); // $ at the end of a line
//        System.out.println("cat doggy".matches("...\\s\\b....."));
//        System.out.println("---".matches("\\W\\W\\W")); // anything other than word character
//        System.out.println("123".matches("\\D\\D\\D")); // anything other than digit character
        System.out.println("2".matches("\\S")); // anything other than space character
    }
}
