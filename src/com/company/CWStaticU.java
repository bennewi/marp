package com.company;

public class CWStaticU extends CWStaticD {

    static {
        countera += "Z";
    }

    {
        countera += "Y";
        this.countera += "X";
        super.countera += "W";
    }

    public CWStaticU(String x) {
        this();
        countera += "V";
    }

    public CWStaticU() {
        super();
        countera += "U";
    }


    public static void setCountera(String valu) {
        countera = valu;
    }

    public static String getCountera() {
        return countera;
    }

    public void setCounterai(String valu) {
        countera = valu;
    }

    public String getCounterai() {
        return countera;
    }

    public static void main (String[] args) {
        try {
            System.out.println("\n");
            System.out.println(new CWStaticU("aa").getCounterai());
            System.out.println(new CWStaticU().getCounterai());
            Thread.sleep(1);
            System.out.println(new CWStaticU("aa").getCounterai());
            System.out.println(new CWStaticU().getCounterai());
            Thread.sleep(1);
            System.out.println(new CWStaticU("aa").getCounterai());
            System.out.println(new CWStaticU().getCounterai());
            Thread.sleep(1);
            System.out.println(new CWStaticU("aa").getCounterai());
            System.out.println(new CWStaticU().getCounterai());
            Thread.sleep(1);
            System.out.println(new CWStaticU("aa").getCounterai());
            System.out.println(new CWStaticU().getCounterai());
            Thread.sleep(1);
        } catch (Exception e) {

        }
    }

}
