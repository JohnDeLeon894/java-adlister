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
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");

//        System.out.println(name);

        try {
            PrintWriter out = response.getWriter();
            String name = "world";
            if (request.getParameter("name") != null){
                name = request.getParameter("name");
            }
            out.println("Hello "+ name + "!!!");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
