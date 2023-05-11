package co.com.choucair.serenitydemo.cer.utils;

import java.util.Stack;

public class Random {

    public static String[] aleatoryNumber() {
        int pos;
        int nCartas = 5;
        Stack<Integer> pCartas = new Stack<Integer>();
        for (int i = 0; i < nCartas; i++) {
            pos = (int) Math.floor(Math.random() * (nCartas + 14) + 1);
            while (pCartas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * (nCartas + 14) + 1);
            }
            pCartas.push(pos);
        }
        String str = pCartas.toString().replace("[", "").replace("]", "").replace(" ", "");
        String split[] = str.split(",");
        return split;
    }

    public static int aleatoryItems() {
        int cant = 9;
        return (int) Math.floor(Math.random() * (cant));
    }
//4.00un
    public static String replaceUnit(String element){
        return element.replace(".00 un", "");
    }

    public static String replaceSimbol(String element){
        return element.replace("$ ", "").replace(".","") ;
    }

    public static String replaceSim(String element){
        return element.replace("$ ", "").replace(".","") ;
    }
}
