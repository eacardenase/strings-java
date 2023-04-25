public class LearnStrings {
    public static void main(String[] args) {
        String myText = "ABCDEFGABCDEFG";

//        System.out.println(myText.indexOf("seven")); // -1
//        System.out.println(myText.indexOf(65)); // 0 because of unicode
//        System.out.println(myText.indexOf("A")); // 0
//        System.out.println(myText.lastIndexOf("A")); // 7
//        System.out.println(myText.indexOf("A", 2)); // 7

        String phoneNumber = "(763) 872-6633";
        String areaCode = findString('(', ')', phoneNumber);
        String exchange = findString(' ', '-', phoneNumber);
        String lineNumber = findString('-', phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String findString(char startChar, String text) {
        int startIndex = text.indexOf(startChar) + 1;

        return  text.substring(startIndex);
    }

    public static String findString(char startChar, char endChar, String text) {
        int startIndex = text.indexOf(startChar) + 1;
        int endIndex = text.indexOf(endChar);

        return  text.substring(startIndex, endIndex);
    }
}
