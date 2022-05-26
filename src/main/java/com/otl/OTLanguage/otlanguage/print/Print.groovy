package com.otl.OTLanguage.otlanguage.print

import com.otl.OTLanguage.otlanguage.setting.Check
import com.otl.OTLanguage.otlanguage.setting.Setting

import java.util.regex.Pattern

class Print extends Setting implements Check {
    private final String SPECIFIED = "ㅅㅁㅅ"
    private final String PATTERN = "\\n\\s*ㅅㅁㅅ\\s|^\\s*ㅅㅁㅅ\\s"
    private final Pattern pattern = Pattern.compile(PATTERN)

    @Override
    void start(String line) {
        boolean bool = pattern.matcher(line).find()
        if (bool) {
            int start = line.indexOf(SPECIFIED)+SPECIFIED.length()
            if (line.startsWith(SPECIFIED + " ")) start += 1
            line = line.substring(start).strip()
            total.append(line)
            return
        } else return
    }

    boolean check(String line) {
        return check(line, pattern)
    }
}
