public class AdditionWithConstructor {

    int a, b;

    public AdditionWithConstructor(int a, int b) {
        this.a = a;
        this.b = b;
   }

    public static void main(String[] args) {
        //passing a and b values below as parameters to constructor
        AdditionWithConstructor additionWithConstructor = new AdditionWithConstructor(10, 20);
        additionWithConstructor.addition();
    }

    public void addition() {
        System.out.println(a + b);
    }
}


