package fdmc.web.servlets;

import fdmc.parsers.HtmlParser;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    private final static String HTML_INDEX_PATH = "E:\\Java\\JavaWeb\\HomeWork\\FDMC\\src\\main\\resources\\index.html";

    private final HtmlParser htmlParser;

    @Inject
    public HomeServlet(HtmlParser htmlParser) {
        this.htmlParser = htmlParser;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println(this.htmlParser.readHtml(HTML_INDEX_PATH));
    }
}
