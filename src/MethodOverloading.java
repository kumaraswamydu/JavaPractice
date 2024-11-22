public class MethodOverloading { //    add(int a, int b) with out return type
    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.add(10, 20);
        int result = methodOverloading.add1(10,20);
        System.out.println(result);
        methodOverloading.add();

    }
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public int add1(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public void add(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }
}





