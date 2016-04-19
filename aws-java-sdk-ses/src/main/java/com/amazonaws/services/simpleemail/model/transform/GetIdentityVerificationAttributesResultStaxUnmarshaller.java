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

package com.amazonaws.services.simpleemail.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetIdentityVerificationAttributesResult StAX Unmarshaller
 */
public class GetIdentityVerificationAttributesResultStaxUnmarshaller
        implements
        Unmarshaller<GetIdentityVerificationAttributesResult, StaxUnmarshallerContext> {

    private static class VerificationAttributesMapEntryUnmarshaller
            implements
            Unmarshaller<Map.Entry<String, IdentityVerificationAttributes>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, IdentityVerificationAttributes> unmarshall(
                StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, IdentityVerificationAttributes> entry = new MapEntry<String, IdentityVerificationAttributes>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance()
                                .unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(IdentityVerificationAttributesStaxUnmarshaller
                                .getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static VerificationAttributesMapEntryUnmarshaller instance;

        public static VerificationAttributesMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new VerificationAttributesMapEntryUnmarshaller();
            return instance;
        }

    }

    public GetIdentityVerificationAttributesResult unmarshall(
            StaxUnmarshallerContext context) throws Exception {
        GetIdentityVerificationAttributesResult getIdentityVerificationAttributesResult = new GetIdentityVerificationAttributesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getIdentityVerificationAttributesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("VerificationAttributes/entry",
                        targetDepth)) {
                    Entry<String, IdentityVerificationAttributes> entry = VerificationAttributesMapEntryUnmarshaller
                            .getInstance().unmarshall(context);
                    getIdentityVerificationAttributesResult
                            .addVerificationAttributesEntry(entry.getKey(),
                                    entry.getValue());
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getIdentityVerificationAttributesResult;
                }
            }
        }
    }

    private static GetIdentityVerificationAttributesResultStaxUnmarshaller instance;

    public static GetIdentityVerificationAttributesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityVerificationAttributesResultStaxUnmarshaller();
        return instance;
    }
}
