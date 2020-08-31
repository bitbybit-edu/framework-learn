package com.bitbybit.framework.learn;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class CommonTest {

    public static void main(String[] args) {
        // 1.通过语言跟地区确定一个Locale对象
        // 中国，中文
        Locale chinaLocale = new Locale("zh", "cn");
        String str1 = "{0}，你好！你于{1}在农业银行存入{2}。";
        MessageFormat messageFormat = new MessageFormat(str1, chinaLocale);
        Object[] o = {"小红", new Date(), 99.99};
        System.out.println(messageFormat.format(o));
        // 输出：小红，你好！你于20-1-15 下午4:05在农业银行存入99.99。
    }
}
