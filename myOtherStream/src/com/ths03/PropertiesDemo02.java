package com.ths03;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties prop =new Properties();
        prop.setProperty("ths01","赵云");
        prop.setProperty("ths02","刘备");
        prop.setProperty("ths03","张飞");

        Set<String> propertyNames = prop.stringPropertyNames();
        for (String key:propertyNames){
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }
    }
}
