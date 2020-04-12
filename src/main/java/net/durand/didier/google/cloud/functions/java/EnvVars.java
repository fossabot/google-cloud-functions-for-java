package net.durand.didier.google.cloud.functions.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class EnvVars implements HttpFunction {
	
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        BufferedWriter writer = response.getWriter();
        Map<String, String> vars = System.getenv();
        for (String var : vars.keySet()) {
        	writer.write("var [" + ": [" + vars.get(var) + "]");
        }
        writer.close();
    }
}

