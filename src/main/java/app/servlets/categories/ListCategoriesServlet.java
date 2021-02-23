package app.servlets.categories;

import app.models.CategoryModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoriesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoryModel model = CategoryModel.getInstance();
        List<String> names = model.list();
        req.setAttribute("category_name", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/web/views/list_categories.jsp");
        requestDispatcher.forward(req, resp);
    }

}
