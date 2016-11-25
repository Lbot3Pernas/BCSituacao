package br.com.estadio.servlet;

import br.com.estadio.dao.ControleDeClientesBVC;
import br.com.estadio.model.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCliente")
public class ServletBC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomeClientela = request.getParameter("nomeClientela");
        String cpfClientela = request.getParameter("cpfClientela");
        String sexoClientela = request.getParameter("sexoClientela");
        String nascimentoClientela = request.getParameter("nascimentoClientela");

        Cliente client = new Cliente();
        client.setNomeClientela(nomeClientela);
        client.setCpfClientela(cpfClientela);
        client.setSexoClientela(sexoClientela);
        client.setNascimentoClientela(nascimentoClientela);
        
        ControleDeClientesBVC cadastra = new ControleDeClientesBVC();
        cadastra.cadastraCliente(client);
        
        response.sendRedirect("cadastraCliente.jsp");
    }
}
