package Kunal.JavaOOPS.interfaces.nested;

public class A {
    //nested interface
    public interface NestedIterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedIterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
