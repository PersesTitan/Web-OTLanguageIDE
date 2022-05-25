package com.otl.OTLanguage.otlanguage.print

import com.otl.OTLanguage.otlanguage.setting.Check
import com.otl.OTLanguage.otlanguage.setting.Setting

import java.util.regex.Pattern

class Print extends Setting implements Check {
    private static final String SPECIFIED = "ㅅㅁㅅ";
    private final Pattern pattern = Pattern.compile("\\n\\s*ㅅㅁㅅ\\s|^\\s*ㅅㅁㅅ\\s");

    @Override
    void start(String line) {

    }

    boolean check(String line) {
        return check(line, pattern)
    }
}
