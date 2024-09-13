package Kunal.JavaOOPS.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();

        car.start();
        car.stop();
        car.acc();

        Media carMedia = new Car();
        carMedia.stop();

        Media player = new CDPlayer();
        player.start();
        player.stop();

        NiceCar ncar = new NiceCar();

        ncar.start();
        ncar.startMusic();
        ncar.upgradeEngine();
        ncar.start();
    }
}
