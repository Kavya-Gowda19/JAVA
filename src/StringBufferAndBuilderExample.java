package Basic;

public class StringBufferAndBuilderExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // Modifies original object
        System.out.println("StringBuffer: " + sb); // Output: Hello World


        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");  // Modifies original object
        System.out.println("StringBuilder: " + sb1); // Output: Hello World
        
    }
}
