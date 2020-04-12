package net.durand.didier.google.cloud.functions.java;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class ThrowException implements HttpFunction {
	
    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
    	throw new Exception("exception thrown by program");
    }
}

