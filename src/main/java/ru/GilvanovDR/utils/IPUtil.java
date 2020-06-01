/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.utils;

import java.util.regex.Pattern;

public class IPUtil {
    private static final String IP_ADDRESS_PATTERN
            = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";

    public static boolean ipValidate(String ipAddress) {
        Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);
        return pattern.matcher(ipAddress).matches();
    }

}
