package com.company;

import java.util.function.Supplier;

import com.vaadin.flow.component.UI;

public class StaticSessionContext<T> {

    private Supplier<T> func;
    private String fieldKey;

    public StaticSessionContext(String fieldKey, Supplier<T> func) {
        this.func = func;
        this.fieldKey = fieldKey;
    }

    public T get() {

        if(UI.getCurrent().getSession().getAttribute(fieldKey)==null) {
            UI.getCurrent().getSession().setAttribute(fieldKey, (T)func.get());
        }

        return (T)UI.getCurrent().getSession().getAttribute(fieldKey);
    }
    public void put(T val) {
        if(UI.getCurrent().getSession().getAttribute(fieldKey)==null) {
            UI.getCurrent().getSession().setAttribute(fieldKey, (T)func.get());
        }

        UI.getCurrent().getSession().setAttribute(fieldKey, val);
    }

}