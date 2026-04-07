package LearnCoding.mod2;

public interface Extending_Interfaces__inheritance_ {

}

interface Gill{
    void add();
}
interface Raj extends Gill{
    void sub();
}

class Ankit implements Raj{
    @Override
    public void add(){
        System.out.println("this is addition");
    }
    @Override
    public void sub(){
        System.out.println("this is subtraction");
    }

    static void main(String[] args) {
        Raj ref = new Ankit();
        ref.add();
        ref.sub();

        System.out.println("");
        Ankit ref2 = new Ankit();
        ref2.add();
        ref2.sub();
    }
}
