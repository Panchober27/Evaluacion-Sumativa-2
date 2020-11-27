/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.controlador;

import cl.inacap.bean.Servicio;
import cl.inacap.modelo.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author francisco
 */
@WebServlet(name = "VentasControlador", urlPatterns = {"/buscar.do", "/vender.do", "/listar.do"})
public class VentasControlador extends HttpServlet {
    Servicio serv = new Servicio();
    ArrayList<Producto> lista = new ArrayList();
    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VentasControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VentasControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*
         * Aqui se debe generar la carga de la lista de los productos.
         * este metodo servira de base para el proximo.
        */
        
        // Variable para almacenar el servletPath de la peticion.
        String strPath = request.getServletPath();
        int codigo;
        
        if(strPath.equals("/listar.do")){ // El path es para listar los productos.
            // Ejecutar metodo getProductos();
            lista = (ArrayList<Producto>) serv.getProductos();
            //Generar un atributo en el request con la lista de productos.
            request.setAttribute("listaProd", lista);
            //Redireccionar hacia listaProductos.jsp
            request.getRequestDispatcher("listaProductos.jsp").forward(request, response);
        } else if(strPath.equals("/vender.do")){
            // Ejecutar metodo getProductos();
            lista = (ArrayList<Producto>) serv.getProductos();
            //Generar un atributo en el request con la lista de productos.
            request.setAttribute("listaProd", lista);
            //Redireccionar hacia vender.jsp
            request.getRequestDispatcher("vender.jsp").forward(request, response);
            
        } else if(strPath.equals("/buscar.do")){
            // Se recupera el codigo a buscar desde la peticion.
            
            codigo = (int) request.getAttribute("txtCodigoProducto");
            
            request.setAttribute("Producto", serv.buscarProducto(codigo));
            //Redireccionar hacia buscar.jsp
            request.getRequestDispatcher("buscarProducto.jsp").forward(request, response);
            
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
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
