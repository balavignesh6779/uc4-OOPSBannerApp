/**
 * OOPSBannerApp UC4 – OOPS Banner Application (Use Case 4)
 *
 * This class extends UC3 by storing banner lines in a String array and
 * using a loop to print them, improving modularity and reusability.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // 1. Create a String array to store all lines of the banner
        String[] bannerLines = {
            String.join(" ","   ****    ","   ****    ","**********  ","**********"),
            String.join(" "," **     ** "," **     ** ","*********** ","**********"),
            String.join(" ","**       **","**       **","**        **","**        "),
            String.join(" ","**       **","**       **","**        **","**        "),
            String.join(" ","**       **","**       **","**       ** ","**********"),
            String.join(" ","**       **","**       **","**********  ","**********"),
            String.join(" ","**       **","**       **","***         ","        **"),
            String.join(" "," **     ** "," **     ** ","***         ","        **"),
            String.join(" ","   ****    ","   ****    ","***         ","**********"),
        };

        // 2. Use a for-each loop to print each element sequentially
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}