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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InputSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSettingsJsonUnmarshaller implements Unmarshaller<InputSettings, JsonUnmarshallerContext> {

    public InputSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputSettings inputSettings = new InputSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("audioSelectors", targetDepth)) {
                    context.nextToken();
                    inputSettings.setAudioSelectors(new ListUnmarshaller<AudioSelector>(AudioSelectorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("captionSelectors", targetDepth)) {
                    context.nextToken();
                    inputSettings.setCaptionSelectors(new ListUnmarshaller<CaptionSelector>(CaptionSelectorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("deblockFilter", targetDepth)) {
                    context.nextToken();
                    inputSettings.setDeblockFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("denoiseFilter", targetDepth)) {
                    context.nextToken();
                    inputSettings.setDenoiseFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterStrength", targetDepth)) {
                    context.nextToken();
                    inputSettings.setFilterStrength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("inputFilter", targetDepth)) {
                    context.nextToken();
                    inputSettings.setInputFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkInputSettings", targetDepth)) {
                    context.nextToken();
                    inputSettings.setNetworkInputSettings(NetworkInputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceEndBehavior", targetDepth)) {
                    context.nextToken();
                    inputSettings.setSourceEndBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("videoSelector", targetDepth)) {
                    context.nextToken();
                    inputSettings.setVideoSelector(VideoSelectorJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inputSettings;
    }

    private static InputSettingsJsonUnmarshaller instance;

    public static InputSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputSettingsJsonUnmarshaller();
        return instance;
    }
}