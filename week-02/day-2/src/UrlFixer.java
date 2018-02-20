import java.util.Arrays;

public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!


        String fixedUrl = url.replace("bots", "odds");

        // Simple way
        //url = fixedUrl.replace("s/", "s:/");

        // Awfully complicated way to add the ":"

        String[] extendedUrl = Arrays.copyOf(fixedUrl.split(""), fixedUrl.length() + 1);
        for (int i = extendedUrl.length - 1; i > 5 ; i--) {
            extendedUrl[i] = extendedUrl[i - 1];
        }
        extendedUrl[5] = ":";

        url = String.join("", extendedUrl);

        System.out.println(url);
    }
}