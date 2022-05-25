package com.otl.OTLanguage.otlanguage.method.trait

import com.otl.OTLanguage.otlanguage.setting.Check
import com.otl.OTLanguage.otlanguage.setting.Setting

import java.util.regex.Pattern

trait PrintTrait implements Check {
    private final String SPECIFIED = "ㅅㅁㅅ"
    private final String PATTERN = "\\n\\s*ㅅㅁㅅ\\s|^\\s*ㅅㅁㅅ\\s"
    private final Pattern pattern = Pattern.compile(PATTERN)

    def check(String line) {
        boolean bool = check(line, pattern)
        if (bool) {
            int start = line.indexOf(SPECIFIED) + SPECIFIED.length()
            if (line.startsWith(SPECIFIED+" ")) start += 1
            Setting.total.append(line.substring(start).strip())
        }
        return bool
    }
}