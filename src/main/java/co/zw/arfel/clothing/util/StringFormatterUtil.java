package co.zw.arfel.clothing.util;

import org.apache.commons.lang3.StringUtils;

public class StringFormatterUtil {

    public String firstLetterUpperCase(String s) {

        s = StringUtils.capitalize(s);
        return s;
    }

}
