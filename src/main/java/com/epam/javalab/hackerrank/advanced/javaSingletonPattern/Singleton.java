package com.epam.javalab.hackerrank.advanced.javaSingletonPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private static volatile Singleton instance = null;
    public String str = "Hello I am a singleton! Let me say hello world to you";
    private Singleton() {}

    public static Singleton  getSingleInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
