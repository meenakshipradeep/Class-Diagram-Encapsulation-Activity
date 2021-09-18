package com.techReturners;

public class Student {
    private String name;
    private String secretNickName;
    private gradeEnum grade;
    private groupEnum group;

    public Student(String name, groupEnum group, gradeEnum grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;

        this.secretNickName = "MySecretNickName";
    }
    public String getName(){
        return this.name;
    }

    public gradeEnum getGrade(){
        return this.grade;
    }

    public void upgrade(){
        this.grade = gradeEnum.values()[this.grade.ordinal() - 1];
    }

    public void downgrade(){
        this.grade = gradeEnum.values()[this.grade.ordinal() + 1];
    }
}
