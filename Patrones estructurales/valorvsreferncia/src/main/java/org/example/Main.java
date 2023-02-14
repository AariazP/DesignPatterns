package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(isIsometricStrings("add", "egg"));

    }



    public static boolean isIsometricStrings(String cadena1, String cadena2){

        HashMap<Character, Character>  hashMapChars = new HashMap<>();


        if (cadena1.length() != cadena2.length()) return false;


        for (int i=0; i<cadena1.length(); i++){

            if(!hashMapChars.containsKey((cadena1.charAt(i)))){
                hashMapChars.put(cadena1.charAt(i), cadena2.charAt(i));
            }

            if(hashMapChars.get(cadena1.charAt(i)) != cadena2.charAt(i)) return false;

        }

        return true;


    }


}

