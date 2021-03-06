/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeKeyPairsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyPairsRequestMarshaller implements Marshaller<Request<DescribeKeyPairsRequest>, DescribeKeyPairsRequest> {

    public Request<DescribeKeyPairsRequest> marshall(DescribeKeyPairsRequest describeKeyPairsRequest) {

        if (describeKeyPairsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeKeyPairsRequest> request = new DefaultRequest<DescribeKeyPairsRequest>(describeKeyPairsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeKeyPairs");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeKeyPairsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeKeyPairsRequest
                .getFilters();
        if (!describeKeyPairsRequestFiltersList.isEmpty() || !describeKeyPairsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeKeyPairsRequestFiltersListValue : describeKeyPairsRequestFiltersList) {

                if (describeKeyPairsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeKeyPairsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeKeyPairsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeKeyPairsRequestKeyNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeKeyPairsRequest
                .getKeyNames();
        if (!describeKeyPairsRequestKeyNamesList.isEmpty() || !describeKeyPairsRequestKeyNamesList.isAutoConstruct()) {
            int keyNamesListIndex = 1;

            for (String describeKeyPairsRequestKeyNamesListValue : describeKeyPairsRequestKeyNamesList) {
                if (describeKeyPairsRequestKeyNamesListValue != null) {
                    request.addParameter("KeyName." + keyNamesListIndex, StringUtils.fromString(describeKeyPairsRequestKeyNamesListValue));
                }
                keyNamesListIndex++;
            }
        }

        return request;
    }

}
