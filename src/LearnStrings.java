public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "banana";  // string literal
        String anotherFruit = "banana"; // points to the same reference as 'fruit'
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli"); // don't point to vegetable reference

        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable == anotherVegetable);
    }
}
