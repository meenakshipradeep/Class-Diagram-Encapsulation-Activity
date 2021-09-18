package com.techReturners;
import com.techReturners.gradeEnum;
import com.techReturners.groupEnum;


public class Main {

    public static void main(String[] args) {
        Student score = new Student("MEENA", groupEnum.values()[0], gradeEnum.values()[0]);

        System.out.println(score.getName());
        System.out.println(score.getClass());
        System.out.println(score.getGrade());


    }
}
