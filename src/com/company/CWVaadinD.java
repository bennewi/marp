package com.company;

public class CWVaadinD {

    public static StaticSessionContext<String> countera = new StaticSessionContext<String>("countera", ()->{return "0";} );

    {
        countera.put(countera.get()+ "A");
        CWVaadinD.countera.put(CWVaadinD.countera.get()+"B");
    }

    {
        countera.put(countera.get()+ "C");
        this.countera.put(this.countera.get()+"D");
        CWVaadinD.countera.put(CWVaadinD.countera.get()+"E");
    }

    public CWVaadinD(String x) {
        this();
        countera.put(countera.get() + "F");
    }

    public CWVaadinD() {
        super();
        countera.put(countera.get() + "G");
    }

    public static void setCountera(String valu) {
        countera.put(valu);
    }

    public static String getCountera() {
        return countera.get();
    }

    public void setCounterai(String valu) {
        countera.put(valu);
    }

    public String getCounterai() {
        return countera.get();
    }



}
