package until;

import dev.codesoapbox.dummy4j.Dummy4j;

public class HandleStringUtils {
    private HandleStringUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getStringByIndex(String input, int fromIndex, int toIndex) {
        return input.substring(fromIndex, toIndex);
    }

}
