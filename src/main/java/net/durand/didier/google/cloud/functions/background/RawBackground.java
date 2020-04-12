package net.durand.didier.google.cloud.functions.background;

import java.util.logging.Logger;

import com.google.cloud.functions.Context;
import com.google.cloud.functions.RawBackgroundFunction;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

//source: https://github.com/GoogleCloudPlatform/functions-framework-java

public class RawBackground implements RawBackgroundFunction {
	  private static final Logger logger =
	      Logger.getLogger(RawBackground.class.getName());

	  @Override
	  public void accept(String json, Context context) {
	    Gson gson = new Gson();
	    JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
	    logger.info("Received JSON object: " + jsonObject);
	  }
	
}
