package core.basesyntax;

public class Buldozer extends  Machine{
    @Override
    public void doWork(){
        System.out.println(getClass().getSimpleName() + " started working...");
    }
    @Override
    public void stopWork(){
        System.out.println(getClass().getSimpleName() + " stopped working...");
    }
}
