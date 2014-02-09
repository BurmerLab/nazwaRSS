package rss;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.nazwa.Blocks;
import pl.nazwa.Item;

/**
 *
 * @author Michał Burmer
 */

//http://localhost:8084/rss/gielda-domen.rss
@WebServlet(name = "gielda", urlPatterns = {"/gielda-domen.rss"})
public class PageRSS extends HttpServlet {
  
    private int itemCounts = 10;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Blocks item = new Blocks();
        try {
            out.println("<rss version=\"2.0\">");
            out.println("\t<channel>");
            out.println("\t\t<title>Giełda domen</title>");
            out.println("\t\t<link>http://www.nazwa.pl/gielda-domen/najciekawsze-domeny/ostatnio-dodane</link>");
            out.println("\t\t<description>Ostatnio dodane</description>");
        
            for(int i = 1; i <= itemCounts; i++){
                out.println("\t\t\t<item>");
                out.println("\t\t\t\t<title>"+item.foundTitle(i) +"</title>");
                out.println("\t\t\t\t<link>"+item.foundHref(i) +"</link>");
                out.println("\t\t\t\t<description>"+item.foundDescription(i) +"</description>");
                out.println("\t\t\t</item>");
            }
            out.println("\t</channel>");
            out.println("</rss>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
