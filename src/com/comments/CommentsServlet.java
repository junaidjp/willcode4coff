package com.comments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet GET Retrieves information
 * identified by a request Uniform Resource Identifier (URI). POST Requests that
 * the server pass the body of the request to the resource identified by the
 * request URI for processing. HEAD Returns only the header of the response that
 * would be returned by a GET request. PUT Uploads data to the server to be
 * stored at the given request URI. The main difference between this and POST is
 * that the server should not further process a PUT request, but simply store it
 * at the request URI. DELETE Deletes the resource identified by the request
 * URI. TRACE Causes the server to return the request message. OPTIONS Asks the
 * server for information about a specific resource or about the server’s
 * capabilities in general.
 */
public class CommentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommentsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Writing the FirstServlet Log");

		try {
			String result = " ";
			try (BufferedReader br = new BufferedReader(new FileReader(
					"/willcode4coffeefeeds/comments.json"))) {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}
				result = sb.toString();
			}

			response.setContentType("application/json");
			PrintWriter writer = response.getWriter();
			System.out.println(result);
			writer.print(result);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String result = " ";
			try (BufferedReader br = new BufferedReader(new FileReader(
					"/willcode4coffeefeeds/comments2.json"))) {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}
				result = sb.toString();
			}

			response.setContentType("application/json");
			PrintWriter writer = response.getWriter();
			System.out.println(result);
			writer.print(result);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}