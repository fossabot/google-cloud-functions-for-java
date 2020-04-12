package net.durand.didier.google.cloud.functions.java;

import java.io.BufferedWriter;
import java.io.PrintStream;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class StackTrace implements HttpFunction {
	
    @Override
    public void service(HttpRequest request, HttpResponse response)throws Exception {
    	 BufferedWriter writer = response.getWriter();
    	 Throwable throwable = new Throwable();
    	 PrintStream printWriter = null;
		 throwable.printStackTrace(printWriter);
    	 writer.close();
    }
}

