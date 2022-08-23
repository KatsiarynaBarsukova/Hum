public class Director extends Person implements Office1 {
    public Director(){
        setPosition("Director");
        }
        public void print () {
            System.out.println(getPosition());
        }
}
