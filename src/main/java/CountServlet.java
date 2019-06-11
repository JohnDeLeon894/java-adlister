import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int count =0;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){

        if(req.getParameter("reset") !=null){
            count = 0;
        }

        count++;
        try {
            resp.getWriter().println("Number of Views is: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
