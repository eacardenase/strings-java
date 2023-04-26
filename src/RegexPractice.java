public class RegexPractice {
    public static void main(String[] args) {
//        System.out.println("Bat".matches("[cCbB]at"));
//        System.out.println("wat".matches("[a-fA-Fw-zW-Z]at"));
//        System.out.println("cat".matches("[^c]at"));
//        System.out.println("Cat".matches("[^a-z]at"));
//        System.out.println("___".matches("\\w\\w\\w"));
//        System.out.println("Ga_".matches("\\w\\w\\w")); // word character
//        System.out.println("123".matches("\\d\\d\\d")); // digit character
//        System.out.println("321-333-7652".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
//        System.out.println("321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}")); // {} is a multiplier
//        System.out.println("321.333.7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));
//        System.out.println("321 333 7652".matches("\\d{3}[-. ]\\d{3}[-. ]\\d{4}"));
//        System.out.println("321 333 7652".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));
//        System.out.println("321   333  7652".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4}")); // + means once or more
//        System.out.println("3213337652".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{4}")); // * means zero or more
//        System.out.println("321-3337652".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}")); // ? means zero or once
//        System.out.println("321 333 765".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,4}")); three or four
//        System.out.println("321 333 7653".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,}")); // at least 3 digits
//        System.out.println("321 333 7653".matches("(\\d{3}[-.\\s]?){2}\\d{3,}")); // () to group
//        System.out.println("333 7653".matches("(\\d{3}[-.\\s]?){1,2}\\d{3,}")); // one to two
        System.out.println("1 321 333 7653".matches("(1[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{3,}"));
    }
}
