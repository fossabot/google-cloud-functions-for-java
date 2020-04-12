package net.durand.didier.google.cloud.functions.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Properties;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class JavaProperties implements HttpFunction {
	
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        BufferedWriter writer = response.getWriter();
        writer.write("java.vm.name: " + System.getProperty("java.vm.name"));
        writer.write("java.home: " + System.getProperty("java.home"));
        writer.write("java.vendor: " + System.getProperty("java.vendor"));
        writer.write("java.version: " + System.getProperty("java.version"));
        writer.write("java.specification.vendor: " + System.getProperty("java.specification.vendor"));
        Properties properties = System.getProperties();
        for ( Object property : properties.keySet()) {
        	writer.write((String)property + ": " + properties.get(property));
        }
        writer.close();
    }
}

