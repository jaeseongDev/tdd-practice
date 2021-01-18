package effectiveJava;

import java.util.regex.Pattern;

public class regex {
    private static final Pattern isNumberOrAlphabet = Pattern.compile("[0-9a-zA-Z]");

    boolean validateString(String s) {
        return isNumberOrAlphabet.matcher(s).matches();
    }
}
