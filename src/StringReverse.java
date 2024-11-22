public class StringReverse {
    public static void main(String[] args) {
        String word = "kumar swamy";
        StringReverse stringReverse = new StringReverse();
        stringReverse.reverse(word);
    }
    public void reverse(String word) {
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
    }
}