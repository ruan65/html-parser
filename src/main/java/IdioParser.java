import model.Idiotizm;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by a on 20/11/2016.
 */
public class IdioParser {

    public static Idiotizm extractIdiotizmFromHtml(String html) {

        Idiotizm idiotizm = new Idiotizm();

        Document document = Jsoup.parse(html);

        Elements bodySmaller = document.getElementsByClass("body smaller");
        Elements elMain = document.getElementsByClass("portfolio_screenshot");

        idiotizm.description = bodySmaller.get(0).text();
        idiotizm.author = bodySmaller.get(1).text();
        idiotizm.imgLink = elMain.get(0).getAllElements().get(2).attr("src").replace("//", "http://");


        System.out.println(idiotizm);

        return idiotizm;
    }

}
