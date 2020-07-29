package com.bitbybit.framework.learn;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class CURLTest {
    private static final Logger logger = LoggerFactory.getLogger(CURLTest.class);

    @Test
    void curl() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();
            // 直接调用curl 掉不通
//            processBuilder.command("curl -F media=@/home/liulin/Desktop/1.jpg \"https://api.weixin.qq.com/cgi-bin/media/upload?access_token=35_Oi7STsgWWarrzncL100nl5fOZHp1csUPD_V79SO0rGqv0OqL9AZdmpk9c3-Hw7k3zqD75n20a8VgSsXUtQQMfgqfYtsIDfoRWrUtf38tyxfDcxqAEiKt8v3okpCm7Alo6tS81AwQyIYjJbYiNAHcAEAANU&type=image\"");
            processBuilder.command("pwd");
            Process start = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            logger.info("result = {}", builder.toString());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
