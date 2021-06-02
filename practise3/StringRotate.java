package com.java.learning.practise3;

public class StringRotate {
    public static void main(String[] args) {

        String name="karthic";
        for(int i=0;i<=10;i++){
            System.out.println(rotateLeftByPosition(name,i));
        }
        for(int i=0;i<=10;i++){
            System.out.println(rotateRightByPosition(name,i));
        }
    }

    private static String rotateLeftByPosition(String str, int pos){
        int posActual= pos%str.length();
        return str.substring(posActual)+str.substring(0,posActual);
    }

    private static String rotateRightByPosition(String str, int pos){
        int posAcutal=pos%str.length();
        return rotateLeftByPosition(str,(str.length()-posAcutal));
    }
}
