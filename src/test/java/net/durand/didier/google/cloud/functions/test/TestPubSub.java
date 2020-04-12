package net.durand.didier.google.cloud.functions.test;

import java.util.ArrayList;
import java.util.List;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.ByteString;

import com.google.pubsub.v1.ProjectTopicName;
import com.google.pubsub.v1.PubsubMessage;

//source: https://cloud.google.com/pubsub/docs/quickstart-client-libraries

@SuppressWarnings("deprecation")
public class TestPubSub {

	  private static final String PROJECT_ID = ""; //ServiceOptions.getDefaultProjectId();
	  public static void main(String... args) throws Exception {
	    String topicId = "test-topic";
	    int messageCount = 5;
		ProjectTopicName topicName = ProjectTopicName.of(PROJECT_ID, topicId);
	    Publisher publisher = null;
	    List<ApiFuture<String>> futures = new ArrayList<>();
	    try {
	      publisher = Publisher
	    		  .newBuilder(topicName)
	    		  .build();
	      for (int i = 0; i < messageCount; i++) {
	        String message = "message-" + i;
	        ByteString data = ByteString.copyFromUtf8(message);
	        PubsubMessage pubsubMessage = PubsubMessage
	        		.newBuilder()
	        		.setData(data)
	        		.build();
	        ApiFuture<String> future = publisher.publish(pubsubMessage);
	        futures.add(future);
	      }
	    } finally {
	      List<String> messageIds = ApiFutures.allAsList(futures).get();
	      for (String messageId : messageIds) {
	        System.out.println(messageId);
	      }
	      if (publisher != null) {
	        publisher.shutdown();
	      }
	    }
	  }
	}

