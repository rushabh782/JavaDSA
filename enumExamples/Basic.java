package Kunal.enumExamples;

public class Basic{
    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //public,static,final
        //Since it's final, u can't create child enums
        //type Week

        Week(){
            System.out.println("Constructor called for "+this);

            //this is not public or protected, only private or default
            //why? we don't want to create new objects
            //this is not enum concept
            //If we have fixed group of objects then only we use enums
        }

        @Override
        public void hello() {
            System.out.println("Hey how are u");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(week.ordinal());


        for (Week day:Week.values()){
            System.out.print(day);
        }

    }
}
