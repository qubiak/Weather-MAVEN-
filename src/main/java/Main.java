import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        try {
            Document weatcherScureData = Jsoup.connect("https://www.google.com/search?q=pogoda&oq=pogoda&aqs=chrome.0.69i59l2j69i61.890j0j4&sourceid=chrome&ie=UTF-8").get();
            Elements temperature = weatcherScureData.getElementsByClass("wob_t");
            System.out.println("Aktualna temperatura w Łodzi to: " + temperature.get(0).text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

