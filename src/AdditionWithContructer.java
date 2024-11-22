public class AdditionWithContructer {

    String lang;
    // constructor accepting single value
    AdditionWithContructer(String lang) {
        this.lang = lang;
    }
    public static void main(String[] args) {
        // call constructor by passing a single value
        AdditionWithContructer additionWithContructer = new AdditionWithContructer("Java");
        additionWithContructer.printLanguage();
    }

    public void printLanguage(){
        System.out.println(lang);
    }
}


