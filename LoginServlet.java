import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

   
    private static final String USERNAME = "vaibhav";
    private static final String PASSWORD = "12345";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ScriptException, IOException {
        
        
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Validate user
            if (USERNAME.equals(username) && PASSWORD.equals(password)) {
                out.println("<h2>Welcome, " + username + "!</h2>");
                out.println("<p>Login successful.</p>");
            } else {
                out.println("<h2>Login Failed</h2>");
                out.println("<p>Invalid username or password. Please try again.</p>");
            }
        }
    }
}
