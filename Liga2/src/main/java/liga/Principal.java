package liga;
import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Principal extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {

        GestorBD gestor = new GestorBD();
        switch (peticion.getParameter("comando")) {
        case "listaEquipos":
            // Obtenemos la lista de presidentes
            ArrayList<Equipos> listaEquipos = gestor.listaEquipos();
            // La anexamos a la petición recibida
            peticion.setAttribute("equipos", listaEquipos);
            // Obtenemos una referencia al JSP listaPresi.jsp
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/listaEquipos.jsp");
            // Reencaminamos la petición recibida (con la lista anexada) al JSP
            rd.forward(peticion, respuesta);
            break;
        default:
            System.err.println("Llamada a Principal con parámetro erróneo.");
            break;
        }
    }
    
    
}