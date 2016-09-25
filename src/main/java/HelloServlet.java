
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

public void doGet(HttpServletRequest incoming,
        HttpServletResponse outgoing)
        throws ServletException, IOException {

        outgoing.setContentType("text/html");

        PrintWriter out = outgoing.getWriter();
        out.println("<html><head><title>Hello!</title></head>");
        out.println("<body bgcolor=\"white\"><h1>Hello Servlet World</h1>");
        out.println("</body></html>");
        out.close();
        }
}
