package com.ll.exam.app_2022_09_23.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Util {
    public static class url {
        public static String encode(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return str;
            }
        }

    }
}
