package com.company;

public class CWStaticD {

    public static String countera = "0";

    static {
        countera += "A";
        CWStaticD.countera += "B";
    }

    {
        countera += "C";
        this.countera += "D";
        CWStaticD.countera += "E";
    }

    public CWStaticD(String x) {
        this();
        countera += "F";
    }

    public CWStaticD() {
        super();
        countera += "G";
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



}
