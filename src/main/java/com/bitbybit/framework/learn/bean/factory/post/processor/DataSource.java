package com.bitbybit.framework.learn.bean.factory.post.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulin
 */
public class DataSource {

    private static final Logger logger = LoggerFactory.getLogger(DataSource.class);

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public void destroy() {
        logger.info("dataSource destory");
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
