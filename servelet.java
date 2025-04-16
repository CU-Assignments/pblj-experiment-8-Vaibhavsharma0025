import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

@WebServlet("/LoginServlet")
public class servelet extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "admin123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get user inputs from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check login
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>You have successfully logged in.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid username or password. Try again.</p>");
            out.println("</body></html>");
        }
    }
}
