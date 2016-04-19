/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.sqs.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MessageAttributeValue StAX Unmarshaller
 */
public class MessageAttributeValueStaxUnmarshaller implements
        Unmarshaller<MessageAttributeValue, StaxUnmarshallerContext> {

    public MessageAttributeValue unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        MessageAttributeValue messageAttributeValue = new MessageAttributeValue();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return messageAttributeValue;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StringValue", targetDepth)) {
                    messageAttributeValue.setStringValue(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BinaryValue", targetDepth)) {
                    messageAttributeValue
                            .setBinaryValue(ByteBufferStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StringListValue", targetDepth)) {
                    messageAttributeValue
                            .withStringListValues(StringStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BinaryListValue", targetDepth)) {
                    messageAttributeValue
                            .withBinaryListValues(ByteBufferStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataType", targetDepth)) {
                    messageAttributeValue.setDataType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return messageAttributeValue;
                }
            }
        }
    }

    private static MessageAttributeValueStaxUnmarshaller instance;

    public static MessageAttributeValueStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageAttributeValueStaxUnmarshaller();
        return instance;
    }
}
