package ImpPrograms;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = s.nextLine().toLowerCase();  // Convert to lowercase

        char[] ch = str.toCharArray();  // Convert string to array of characters

        boolean[] visited = new boolean[ch.length];  // To track already counted

        for (int i = 0; i < ch.length; i++) {
            if (visited[i] || ch[i] == ' ') {
                continue;  // Skip spaces and already counted characters
            }

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;  // Mark as counted
                }
            }

            System.out.println(ch[i] + " = " + count + " time(s)");
        }
    }
}
