package com.bootcoding.java.assignment;

public class GradeSystem {
    public static void main(String[] args) {
        int[] studentPer={71,75,65,89,55,35};
        char[]gradeResults=calculateGrade(studentPer);
        for(int i=0;i<gradeResults.length;i++){
            System.out.println(studentPer[i]+"->"+gradeResults[i]);
        }
    }
    public  static char[] calculateGrade(int[] studentPer){
        char[]grads = new  char[studentPer.length];
        for (int i=0;i<studentPer.length; i++){
            char grade;
            int percentage = studentPer[i];
            grade=getGrade(percentage);
            grads[i]=grade;
        }
        return  grads;
    }
    private static char getGrade(int percentage){
        char grade;
        if(percentage>=60){
            grade='A';
        }else if (percentage>=60){
            grade='B';
        }else{
            grade='C';
        }
        return grade;
    }

}

