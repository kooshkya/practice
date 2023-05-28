package enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginViewCommands {
    ListCommands("help"),
    RegisterAsStudent("register -s -u (?<username>.*) -p (?<password>.*)"),
    Quit("[qQ]uit");

    Pattern pattern;
    LoginViewCommands(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }
    public Matcher getMatcher(String input) {
        return this.pattern.matcher(input);
    }
}
