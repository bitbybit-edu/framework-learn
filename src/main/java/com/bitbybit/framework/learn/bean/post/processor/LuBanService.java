package com.bitbybit.framework.learn.bean.post.processor;

import org.springframework.stereotype.Component;

/**
 * @author liulin
 */
@Component
public class LuBanService {

    private String value = "1";

    @Override
    public String toString() {
        return "LuBanService{" +
                "value='" + value + '\'' +
                '}';
    }
}
