package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.User;

/**
 * Servlet implementation class Main
 * role : rediriger sur la page de logs
 * par defaut on arrive dans le main (parametre de web.xml
 */
@WebServlet(
		name		= "main",
		urlPatterns = "/"
)
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//on redirige directement sur la page d'acceuil
		//User userConnected = (User)request.getSession().getAttribute("user");
	//	if ( userConnected == null) {
			request.getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	//	}else {
		//	request.getRequestDispatcher("/WEB-INF/Catalogues.jsp").forward(request, response);			
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//on fait la même chose pour le doPost
		doGet(request, response);
	}

}
