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

package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AdminGetUserResult JSON Unmarshaller
 */
public class AdminGetUserResultJsonUnmarshaller implements
        Unmarshaller<AdminGetUserResult, JsonUnmarshallerContext> {

    public AdminGetUserResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AdminGetUserResult adminGetUserResult = new AdminGetUserResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult.setUsername(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("UserAttributes", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult
                            .setUserAttributes(new ListUnmarshaller<AttributeType>(
                                    AttributeTypeJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("UserCreateDate", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult.setUserCreateDate(context
                            .getUnmarshaller(java.util.Date.class).unmarshall(
                                    context));
                }
                if (context.testExpression("UserLastModifiedDate", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult.setUserLastModifiedDate(context
                            .getUnmarshaller(java.util.Date.class).unmarshall(
                                    context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult.setEnabled(context.getUnmarshaller(
                            Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UserStatus", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult.setUserStatus(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("MFAOptions", targetDepth)) {
                    context.nextToken();
                    adminGetUserResult
                            .setMFAOptions(new ListUnmarshaller<MFAOptionType>(
                                    MFAOptionTypeJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return adminGetUserResult;
    }

    private static AdminGetUserResultJsonUnmarshaller instance;

    public static AdminGetUserResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AdminGetUserResultJsonUnmarshaller();
        return instance;
    }
}
