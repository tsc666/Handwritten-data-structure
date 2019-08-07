package com.company;

public class Student {
    private String name;
    private  int score;

    public Student(String studentname,int studentscore){
        name = studentname;
        score = studentscore;
    }

    @Override
    public String toString(){
        return String.format("Student(name:%s,score:%d)\n",name,score);
    }

    public static  void main (String args[]){
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("TSC",100));
        arr.addLast(new Student("dkm",90));
        System.out.println(arr);
    }
}
