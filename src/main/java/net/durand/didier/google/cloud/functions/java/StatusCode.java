package net.durand.didier.google.cloud.functions.java;

import java.io.IOException;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import net.durand.didier.google.cloud.functions.HttpCode;

public class StatusCode implements HttpFunction {
	
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.setStatusCode(HttpCode.INTERNAL_SERVER_ERROR);;
    }
}

