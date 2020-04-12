package net.durand.didier.google.cloud.functions.background;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;

//source: https://github.com/GoogleCloudPlatform/functions-framework-java/blob/master/functions-framework-api/src/main/java/com/google/cloud/functions/BackgroundFunction.java
public class PubSub implements BackgroundFunction<Object> {

	@Override
	public void accept(Object payload, Context context) {
	}

}
