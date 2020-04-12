package net.durand.didier.google.cloud.functions.java;

import java.io.BufferedWriter;
import java.io.IOException;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class HelloWorld implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        BufferedWriter writer = response.getWriter();
        writer.write("Hello world! @ " + System.currentTimeMillis());
        writer.close();
    }
    
}

