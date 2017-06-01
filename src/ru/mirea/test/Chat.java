package ru.mirea.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


@WebServlet(name = "Chat", urlPatterns = {"/MainServlet/Chat"})
public class Chat extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write("<script> fenction getFromServer() {var xhr = new XMLHttpRequest()     method = \"GET\",\n" +
                "    url = \"http://localhost:8080/MainServlet/messages/\";\n" +
                "\n" +
                "xhr.open(method, url, true); xhr.onreadystatechange = function () {\n" +
                "        if(xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {" +
                "var div = document.getElementById('messages');" +
                "div.    Html =xhr.ResponseText;" +
                "} else {alert('error');}" +
                "xhr.send();};} " +
                "window.onload = function() {setInterval(getFromServer,2000);}; </script>");
        response.getWriter().write("<div id = 'messages'></div>");
    }

}

