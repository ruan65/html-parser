import model.Idiotizm;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a on 20/11/2016.
 */
public class TestIdioParser {

    Idiotizm idiotizm = IdioParser.extractIdiotizmFromHtml(Htmls.htmlPageString);

    @Test
    public void checkIfDescriptionIsCorrect() {
        assertEquals("Дерьмо", idiotizm.description);
    }

    @Test
    public void checkIfAuthorIsCorrect() {
        assertEquals("Прислал Miguel_Condie", idiotizm.author);
    }


    @Test
    public void checkIfImageLinkIsCorrect() {

        assertEquals(
                "http://img.artlebedev.ru/kovodstvo/idioteka/i/B18EB030-93C4-49E8-9B3C-FF0DA11DD0FA.jpg",
                idiotizm.imgLink
                );



    }

}
