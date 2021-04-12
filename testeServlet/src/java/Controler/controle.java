package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;

@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
public class controle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Aluno a = new Aluno();
            a.setNome(request.getParameter("nome"));
            a.setNota1(Float.parseFloat(request.getParameter("nota1")));
            a.setNota2(Float.parseFloat(request.getParameter("nota2")));
            a.calcMedia();
            
            request.setAttribute("aluno", a);
            
            RequestDispatcher disp = request.getRequestDispatcher("cadastro_resp.jsp");
            disp.forward(request, response);   
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
