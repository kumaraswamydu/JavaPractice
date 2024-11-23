import java.util.HashMap;
import java.util.Map;

public class RepeatedWordsCount {
    public static void main(String[] args) {
        String input = "Java is great and java is fun Programming in java is great";
        RepeatedWordsCount repeatedWordsCount = new RepeatedWordsCount();
//        repeatedWordsCount.repetedwordswithmap(input);
        repeatedWordsCount.repetedwordswithoutmap(input);
    }

    public void repetedwordswithoutmap(String input) {
        int count;
        String words[] = input.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (count > 1 && !words[i].equals("0")) {
                System.out.println(words[i] + " " + count);
            }
        }
    }

    public void repetedwordswithmap(String input) {
        // Normalize the string by converting it to lower case
        String normalizedInput = input.toLowerCase();
        // Split the string into words using a regular expression
        String[] words = normalizedInput.split(" ");
        // Use a HashMap to store each word and its count
        Map<String, Integer> wordCountMap = new HashMap<>();
        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        // Display the duplicate words and their counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}