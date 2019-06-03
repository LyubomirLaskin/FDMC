package fdmc.parsers;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface HtmlParser {

    public String readHtml(String path) throws IOException;
}
