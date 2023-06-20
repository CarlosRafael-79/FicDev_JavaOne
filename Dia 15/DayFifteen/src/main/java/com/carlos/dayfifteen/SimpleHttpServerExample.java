/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.dayfifteen;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 *
 * @author ficdev
 */
public class SimpleHttpServerExample {

    public static void main(String[] args) throws IOException {
        
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/api/ola", new MyHandler());
        server.start();
        System.out.println(" Started.Visit http://localhost:8080/api/ola");
    }

    static class MyHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = " Ola aluno FICDEV!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            try (OutputStream outputStream = exchange.getResponseBody()) {
                outputStream.write(response.getBytes());
            }
        }
    }
}
