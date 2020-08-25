package com.bitbybit.framework.learn.bean.post.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liulin
 */
@Component
public class IndexService {

    @Autowired
    LuBanService luBanService;

    @Override
    public String toString() {
        return "IndexService{" +
                "luBanService=" + luBanService +
                '}';
    }
}
