package com.example.secureapp;

public class Encode {

    public static String enc(String s){
        String initalizer = "11111111";
        int ct=0;
        int a[] = new int [11111111];
        for (int i=0;i<s.length();i++){
            a[i] = (int)s.charAt(i);
            ct++;
        }

        String res ="";
        int bin[] = new int[111];
        int idx = 0;
        for (int i=0;i<ct;i++){
            int temp = a[i];
            for (int j = 0; j<ct;j++) bin[j]=0;
            idx = 0;
            while (temp>0){
                bin[idx++]= temp%2;
                temp=temp/2;
            }

            String dig = "";
            String temps;
            for(int j=0;j<7;j++){
                temps = Integer.toString(bin[j]);
                dig = dig.concat(temps);
            }
            String rev="";
            for(int j = dig.length()-1;j>=0;j--){
                char ca = dig.charAt(j);
                rev = rev.concat(String.valueOf(ca));
            }
            res = res.concat(rev);
        }
        res = initalizer.concat(res);
        return res;
    }
}
