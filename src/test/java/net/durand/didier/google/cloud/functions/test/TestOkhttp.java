package net.durand.didier.google.cloud.functions.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class TestOkhttp {
	
	@Test
	public void whenGetRequest_thenCorrect() throws IOException {
		String url = "";
		OkHttpClient client = new OkHttpClient();
	    Request request = new Request.Builder()
	      .url(url)
	      .build();
	    Call call = client.newCall(request);
	    Response httpResponse = call.execute();
	    //
	    assertEquals(200,httpResponse.code());
	    ResponseBody body = httpResponse.body();
	    String response = body.bytes().toString();
	    assertTrue(response.startsWith("Hellow, World!"));
	}
}
