package Kunal.JavaOOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal Kushwaha", 45300, false);
        Human rahul = new Human(34, "Rahul", 45200, true);
        Human arpit = new Human(34, "arpit", 4500, true);

        System.out.println(Human.population);//here population is static variable so we are calling it through className
        System.out.println(Human.population);
        System.out.println(Human.population);

    }
}
