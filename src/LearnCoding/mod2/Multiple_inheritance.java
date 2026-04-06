package LearnCoding.mod2;

public interface Multiple_inheritance {
}

interface A{
    void show(); // public + abstract
}
interface B{
    void show(); // also public + abstract
}

class C implements A,B{
    @Override
    public void show(){
        System.out.println("interface A and B");
    }

    static void main(String[] args) {
        A obj = new C();
        B obj1= new C();
        C obj2 = new C();
        obj.show();
        obj1.show();
        obj2.show();

    }
}