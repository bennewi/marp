package com.company;

public class CWVaadinU extends CWVaadinD {

    {
        countera.put(countera.get()+ "Z");
    }

    {
        countera.put(countera.get()+ "Y");
        this.countera.put(this.countera.get()+"X");
        super.countera.put(super.countera.get()+"W");
    }

    public CWVaadinU(String x) {
        this();
        countera.put(countera.get()+ "V");
    }

    public CWVaadinU() {
        super();
        countera.put(countera.get()+ "U");
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

    public static void main (String[] args) {
        try {
            System.out.println("\n");
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
            Thread.sleep(10);
            System.out.println(new CWVaadinU("aa").getCounterai());
            System.out.println(new CWVaadinU().getCounterai());
        } catch (Exception e) {

        }
    }

}
