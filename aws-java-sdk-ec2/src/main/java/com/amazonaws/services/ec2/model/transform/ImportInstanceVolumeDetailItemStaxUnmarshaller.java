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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ImportInstanceVolumeDetailItem StAX Unmarshaller
 */
public class ImportInstanceVolumeDetailItemStaxUnmarshaller implements
        Unmarshaller<ImportInstanceVolumeDetailItem, StaxUnmarshallerContext> {

    public ImportInstanceVolumeDetailItem unmarshall(
            StaxUnmarshallerContext context) throws Exception {
        ImportInstanceVolumeDetailItem importInstanceVolumeDetailItem = new ImportInstanceVolumeDetailItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return importInstanceVolumeDetailItem;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("bytesConverted", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setBytesConverted(LongStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setAvailabilityZone(StringStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("image", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setImage(DiskImageDescriptionStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volume", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setVolume(DiskImageVolumeDescriptionStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setStatus(StringStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setStatusMessage(StringStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    importInstanceVolumeDetailItem
                            .setDescription(StringStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return importInstanceVolumeDetailItem;
                }
            }
        }
    }

    private static ImportInstanceVolumeDetailItemStaxUnmarshaller instance;

    public static ImportInstanceVolumeDetailItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstanceVolumeDetailItemStaxUnmarshaller();
        return instance;
    }
}
