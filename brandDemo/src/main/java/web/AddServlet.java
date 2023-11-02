package web;

import bean.Brand;
import service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

    private final BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
//        String brandName = new String(request.getParameter("brandName").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        Integer ordered = Integer.valueOf(request.getParameter("ordered"));
        String description = request.getParameter("description");
        Integer status = Integer.valueOf(request.getParameter("status"));

        Brand brand = new Brand(0, brandName, companyName, ordered, description, status);

        brandService.add(brand);

        request.getRequestDispatcher("/selectAllServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
