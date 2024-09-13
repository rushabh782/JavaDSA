package Kunal.JavaOOPS.interfaces;

public class NiceCar {
    private Engine engine;//Engine -> interface, engine -> object of Engine interface
    private Media player = new CDPlayer();//Media -> interface, player -> object of Media interface, CDPlayer -> class which is being referenced

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine =  new ElectricEngine();
    }
}
