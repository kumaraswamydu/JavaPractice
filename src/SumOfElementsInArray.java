public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 7};
        SumOfElementsInArray sumOfElementsInArray = new SumOfElementsInArray();
        sumOfElementsInArray.child(array);
    }
    public void child(int[] intArray) {
        int length = intArray.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + intArray[i];
        }
        System.out.println("sum of elements in array : " + sum);
    }
}
