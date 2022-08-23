public class Worker extends Person implements Office1 {
    public Worker(){
        setPosition("Worker");
    }
    public void print () {
        System.out.println(getPosition());
    }
}
