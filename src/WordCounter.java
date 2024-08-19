import java.util.Arrays;

public class WordCounter {

    private final java.util.ArrayList<String> wordsList;
    private final java.util.HashMap<String, Integer> wordCountMap;

    public WordCounter(String[] wordsArray) {
        this.wordsList = new java.util.ArrayList<>();
        this.wordCountMap = new java.util.HashMap<>();
        wordsList.addAll (Arrays.asList (wordsArray));
        countWords();
    }

    private void countWords() {
        for (String word : wordsList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }

    public void printUniqueWords() {
        System.out.println("Список уникальных слов и их количество:");
        for (java.util.Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
