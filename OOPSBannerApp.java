import java.util.*;

// Step 4: Class to store character pattern
class LetterPattern {
    private String[] pattern;

    public LetterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSBannerApp {

    // Step 5: Map to store letter patterns
    static Map<Character, LetterPattern> letterMap = new HashMap<>();

    public static void main(String[] args) {

        // Step 1: Simple display
        System.out.println("Simple Output:");
        System.out.println("OOPS\n");

        // Initialize patterns
        initializePatterns();

        // Step 2 & 3 & 4 & 5: Banner display
        System.out.println("Banner Output:");
        displayBanner("OOPS");
    }

    // Initialize patterns and store in Map
    public static void initializePatterns() {

        letterMap.put('O', new LetterPattern(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        letterMap.put('P', new LetterPattern(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        letterMap.put('S', new LetterPattern(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    // Step 3: Function to display banner
    public static void displayBanner(String text) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            for (char ch : text.toCharArray()) {
                LetterPattern letter = letterMap.get(ch);
                if (letter != null) {
                    System.out.print(letter.getPattern()[i] + "  ");
                }
            }
            System.out.println();
        }
    }
}