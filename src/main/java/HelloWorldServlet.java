import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

//        System.out.println(name);

        try {
            PrintWriter out = response.getWriter();
            String name = "Mundo";
            if (request.getParameter("name") != null) {
                name = request.getParameter("name");
            }
            out.println("<h1>Hello " + name + "!!!</h1>");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
