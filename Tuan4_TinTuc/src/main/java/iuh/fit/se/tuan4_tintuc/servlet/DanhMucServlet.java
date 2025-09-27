package iuh.fit.se.tuan4_tintuc.servlet;

import iuh.fit.se.tuan4_tintuc.dao.DanhMucDAO;
import iuh.fit.se.tuan4_tintuc.model.DanhMuc;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/danhmuc", "/danhmuc/*"})
public class DanhMucServlet extends HttpServlet {
    private DanhMucDAO danhMucDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        danhMucDAO = new DanhMucDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DanhMuc> list = danhMucDAO.findAll();
        System.out.println(list); // Print to console for debugging
        req.setAttribute("DanhMucList", list);
        req.getRequestDispatcher("danhmuc-list.jsp").forward(req, resp);
    }
}
