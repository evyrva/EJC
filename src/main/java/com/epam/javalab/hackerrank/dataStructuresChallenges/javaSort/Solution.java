package com.epam.javalab.hackerrank.dataStructuresChallenges.javaSort;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 == null || o2 == null) throw new NullPointerException();
                if (o1.getCgpa() - o2.getCgpa() != 0) return (int) Math.signum(o2.getCgpa() - o1.getCgpa());
                if (!o1.getFname().equals(o2.getFname())) return o1.getFname().compareTo(o2.getFname());
                return o2.getId() - o1.getId();
            }
        });
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
        System.out.println(Math.signum(-0.53));
    }
}
