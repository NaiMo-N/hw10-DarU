// HW4

import java.util.ArrayList;
import java.util.Iterator;

public class Student{
    int grade;

    public Student(int grade){
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Student grade is: " + grade;
    }

    public static void main(String[] args){
        ArrayList<Student> mark = new ArrayList<>();
        mark.add(new Student(87));
        mark.add(new Student(98));
        mark.add(new Student(76));
        mark.add(new Student(85));
        Iterator<Student> iteratorGrade = mark.iterator();
        while(iteratorGrade.hasNext()){
            System.out.println(iteratorGrade.next());
        }
    }
}



