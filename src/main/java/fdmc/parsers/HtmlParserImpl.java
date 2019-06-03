package fdmc.parsers;

import java.io.*;

public class HtmlParserImpl implements HtmlParser {

    @Override
    public String readHtml(String path) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                new File(path)
                        )
                )
        );

        StringBuilder htmlBuilder = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null){
            htmlBuilder.append(line);
        }
        return htmlBuilder.toString().trim();
    }
}
