package com.vaadin.flow.component;

public class UI {

    private static UI single = new UI();
    public static UI getCurrent() {
        return single;
    }
    public Session getSession() {
        return Session.getCurrent();
    }
}
