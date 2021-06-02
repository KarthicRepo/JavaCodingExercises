package com.java.learning.simple;

public class StringTest {
    public static void main(String[] args) {
        String ETSI_MOCK_JAR="/<VER>/etsi-vnfm-mock-<VER>.jar";
       // String ETSI_MOCK_JAR="%s-jar";
        System.out.println(ETSI_MOCK_JAR.replaceAll("<VER>","5.1.3"));
    }
}
