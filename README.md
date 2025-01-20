RequestDispatcher Usage for Servlet Chaining:
In this application, we utilize the RequestDispatcher to forward the request from the SumServlet to the SquareServlet. The RequestDispatcher allows us to send the request and response objects to another resource (in this case, another servlet) without the client being aware of it.
1.	Setting Attributes: After calculating the sum in the SumServlet, we store the result in a request attribute using request.setAttribute("sum", sum);. This makes the sum available to the next servlet.
2.	Forwarding the Request: We then create a RequestDispatcher object with request.getRequestDispatcher("SquareServlet"); and call dispatcher.forward(request, response);. This forwards the request to the SquareServlet, allowing it to access the sum we just calculated.
3.	Processing in the Second Servlet: In the SquareServlet, we retrieve the sum using int sum = (Integer) request.getAttribute("sum"); and calculate its square. Finally, we display the result to the user.
This method of chaining servlets using RequestDispatcher promotes a clean separation of concerns, where each servlet handles a specific part of the processing, making the application modular and easier to maintain.

