package com.bootcoding.java.assignment;

public class Demo {
    public static boolean isSeniorCitizien(int[] ages) {
        for(int i=0;i < ages.length;i++){
            if(ages[i] >=60){
                return true;
            }

        }
        return false;
    }

    public static void main(int[] args) {
        int[] ages={40,61,54,30,34,64};
        boolean result= isSeniorCitizien(ages);
        System.out.println(result);

    }

}
