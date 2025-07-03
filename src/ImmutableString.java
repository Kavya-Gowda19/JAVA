package Basic;

public class ImmutableString {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");  // New object is created but not stored
        System.out.println("Without assignment: " + s); // Output: Hello

        s = s.concat(" World");  // Now stored
        System.out.println("With assignment: " + s);     // Output: Hello World
    }
}
