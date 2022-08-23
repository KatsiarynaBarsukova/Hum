public class Accountant extends Person implements Office1 {
    public Accountant(){
        setPosition("Accountant");
    }

    @Override
    public void print () {
        System.out.println(getPosition());
    }
}
