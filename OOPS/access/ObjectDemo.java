package Kunal.JavaOOPS.access;

public class ObjectDemo {
    int num;
    float gpa;


    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }
    public ObjectDemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    //we will go in detail of how to create it in hashMap lecture
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12,67.9f);
        ObjectDemo obj2 = new ObjectDemo(12,63.7f);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());


        if (obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());
    }

}
