package javaregexandjunit;

import java.util.regex.*;

public class LanguageExtractor {

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        Pattern p = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

