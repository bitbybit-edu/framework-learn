package com.bitbybit.framework.learn;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class CURLTest {
    private static final Logger logger = LoggerFactory.getLogger(CURLTest.class);

    @Test
    void curl() {
        try {
            Process exec = Runtime.getRuntime().exec("curl -F media=@/home/liulin/Desktop/1.jpg \"https://api.weixin.qq.com/cgi-bin/media/upload?access_token=35_OCDoPtp6uf9P2FfLIlc5OjP9OSn8HMK7Tvs6a_2dLuItzyH3Gl2vAvks_KivVTFhtarIXPgWMrfJSozg9UTkwoo90CZ9mBJAglpzb1sqg1kv9J3w12bswoGEGdwwD-ITpfxetPPlzLEQz9a3XTGhADAEAN&type=image\"");
            List<String> processList = new ArrayList<String>();

        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
