package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

/**
 * Handler
 *
 * @see <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs-create-package.html#with-sqs-example-deployment-pkg-java">Sample Amazon SQS function code - Java</a>
 *
 * @author gary
 * @since 2023-01-05
 */
public class Handler implements RequestHandler<SQSEvent, Void> {

	@Override
	public Void handleRequest(SQSEvent event, Context context) {
		for (final SQSMessage msg : event.getRecords()) {
			System.out.println(new String(msg.getBody()));
		}
		return null;
	}

}