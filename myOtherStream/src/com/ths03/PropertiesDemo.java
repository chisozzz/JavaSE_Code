package com.ths03;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop =new Properties();
        prop.put("ths01","zhangsan");
        prop.put("ths02","lisi");
        prop.put("ths03","wangwu");
        Set<Object> keySet = prop.keySet();
        for (Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
