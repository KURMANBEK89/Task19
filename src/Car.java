public class Car implements AutoCloseable{
@Override
    public void close(){
        System.out.println("Машина закрывается");
    }
    public void drive(){
        System.out.println("Машина едет");
    }
}
