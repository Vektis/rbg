package com.company;

/**
 * Created by vianrosal on 1/24/17.
 */
public class convert {
    public convert(){

    }
    public static String hexToRgb(String s){
        char [] parts = s.toLowerCase().toCharArray();
        int p1;
        int p;
        if(parts[0] == 'c'){
            p1 = 12;
        }
        else if(parts[0] == 'a'){
            p1 = 10;
        }
        else if(parts[0] == 'b'){
            p1 = 11;
        }
        else if(parts[0] == 'd'){
            p1 = 13;
        }
        else if(parts[0] == 'e'){
            p1 = 14;
        }
        else if(parts[0] == 'f'){
            p1 = 15;
        }
        else{
            p1 = parts[0];
        }
        //efficency
        if(parts[1] == 'c'){
            p = 12;
        }
        else if(parts[1] == 'a'){
            p = 10;
        }
        else if(parts[1] == 'b'){
            p = 11;
        }
        else if(parts[1] == 'd'){
            p = 13;
        }
        else if(parts[1] == 'e'){
            p = 14;
        }
        else if(parts[1] == 'f'){
            p = 15;
        }
        else{
          p = parts[1]-48;
        }
        return ""+((16*p1)+p);
    }


    public static String rgbToHex(String s){
        String a;
        String b;
        int i = Integer.parseInt(s);
        int p1 = i/16;
        //System.out.println(p1);
        if(p1 == 15){
            a = "F";
        }
        else if(p1 == 14){
            a = "E";
        }
        else if(p1 == 13){
            a = "D";
        }
        else if(p1 == 12){
            a = "C";}
        else if(p1 == 11){
            a = "B";
        }
        else if (p1 == 10){
            a = "A";
        }
        else{
            a = ""+ p1;
        }

        int p2 = i-((i/16)*16);
        if(p2 == 15){
            b = "F";
        }
        else if(p2 == 14){
            b = "E";
        }
        else if(p2 == 13){
            b = "D";
        }
        else if(p2 == 12){
            b = "C";}
        else if(p2 == 11){
            b = "B";
        }
        else if (p2 == 10){
            b = "A";
        }
        else{
            b = ""+ p1;
        }
        //System.out.println(p2);
        return a+b;
    }
}
