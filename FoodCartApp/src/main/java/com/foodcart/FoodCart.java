package com.foodcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Get Data from the database(model)
		
		String[] foodItems = {"Biryani","Pizza","Lollypop"};
		
		request.setAttribute("foodItems", foodItems);
		
		//Redirect to a different page(view)
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-food.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
