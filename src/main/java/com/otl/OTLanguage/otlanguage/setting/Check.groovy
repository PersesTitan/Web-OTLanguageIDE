package com.otl.OTLanguage.otlanguage.setting

import java.util.regex.Pattern

interface Check {
    void start(String line)
    default boolean check(String line, Pattern pattern) {
        return pattern.matcher(line).find()
    }
}