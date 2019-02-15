/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListDatasetContentsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListDatasetContentsRequestMarshaller {

    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("datasetName").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<java.util.Date> SCHEDULEDONORAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("scheduledOnOrAfter").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> SCHEDULEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("scheduledBefore").timestampFormat("iso8601").build();

    private static final ListDatasetContentsRequestMarshaller instance = new ListDatasetContentsRequestMarshaller();

    public static ListDatasetContentsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListDatasetContentsRequest listDatasetContentsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listDatasetContentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listDatasetContentsRequest.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(listDatasetContentsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listDatasetContentsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listDatasetContentsRequest.getScheduledOnOrAfter(), SCHEDULEDONORAFTER_BINDING);
            protocolMarshaller.marshall(listDatasetContentsRequest.getScheduledBefore(), SCHEDULEDBEFORE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}