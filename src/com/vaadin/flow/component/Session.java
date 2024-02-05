package com.vaadin.flow.component;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Session {

    TreeMap attribs = new TreeMap();
    private static Session[] six = new Session[6];
    static {
        for (int i = 0; i < 6; ++i) {
            six[i] = new Session();
        }
    }
    public static Session getCurrent() {
        int rando = (int)System.currentTimeMillis()/10*10 % 6;
        return six[rando];
    }
    public Object getAttribute(String key) {
        synchronized(this) {
            return attribs.get(key);
        }
    }
    public void setAttribute(String key, Object val) {
        synchronized(this) {
            attribs.put(key, val);
        }
    }
}
