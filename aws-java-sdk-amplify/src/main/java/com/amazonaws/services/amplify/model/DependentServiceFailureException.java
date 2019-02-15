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
package com.amazonaws.services.amplify.model;

import javax.annotation.Generated;

/**
 * <p>
 * Exception thrown when an operation fails due to a dependent service throwing an exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DependentServiceFailureException extends com.amazonaws.services.amplify.model.AWSAmplifyException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DependentServiceFailureException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DependentServiceFailureException(String message) {
        super(message);
    }

}