package hello.servlet.web.frontController.v1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ControllerV1 {
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
