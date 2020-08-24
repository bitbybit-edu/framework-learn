package com.bitbybit.framework.learn.bean.post.processor;

import org.springframework.stereotype.Component;

/**
 * @author liulin
 */
@Component
public class IndexService {

    private LuBanService luBanService;

    @Override
    public String toString() {
        return "IndexService{" +
                "luBanService=" + luBanService +
                '}';
    }
}
