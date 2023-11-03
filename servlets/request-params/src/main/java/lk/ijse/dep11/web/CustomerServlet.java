package lk.ijse.dep11.web;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/customers")
@MultipartConfig(location = "/tmp", maxFileSize = 1024 * 1024 * 5)
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Content-Type: " + req.getContentType());
//        BufferedReader reader = req.getReader();
//        String line;
//        StringBuilder requestBody = new StringBuilder();
//        while ((line = reader.readLine()) != null) {
//            requestBody.append(line);
//        }
//        String decodedRequestBody = URLDecoder.decode(requestBody.toString(), StandardCharsets.UTF_8);
//        String[] parameters = decodedRequestBody.split("&");
//        for (String parameter : parameters) {
//            String[] parameterData = parameter.split("=");
//            System.out.println(parameterData[0] + ":" + parameterData[1]);
//        }
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        System.out.printf("id=%s, name=%s, address=%s \n", id, name, address);
        Part profilePicture = req.getPart("profile-picture");
        profilePicture.write("/home/ranjith-suranga/Desktop/uploads/" + profilePicture.getSubmittedFileName());
    }
}
