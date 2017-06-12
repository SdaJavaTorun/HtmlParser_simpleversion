import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) throws IOException {


        Document document = Jsoup.connect("http://google.pl/").get();
        String text = document.body().text();

        System.out.println(text);

        String[] words = text.split("(?=[,.])|\\s+");
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

        for (String word : words) {
            if (hashmap.containsKey(word)) {
                hashmap.get(word += 1);
            } else {
                hashmap.put(word, 1);
            }
        }
        System.out.println(hashmap.entrySet());
    }

}