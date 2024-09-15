package Kunal.generics.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public  Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(@NotNull Student o) {
        int  diff = (int)(this.marks - o.marks);

        //if diff == 0: means both are equal
        //if diff < 0: means o is bigger else o is smaller


        return diff;
    }
}
