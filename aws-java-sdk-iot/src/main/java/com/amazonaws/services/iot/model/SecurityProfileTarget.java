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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A target to which an alert is sent when a security profile behavior is violated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityProfileTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * 
     * @param arn
     *        The ARN of the security profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * 
     * @return The ARN of the security profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * 
     * @param arn
     *        The ARN of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileTarget withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfileTarget == false)
            return false;
        SecurityProfileTarget other = (SecurityProfileTarget) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public SecurityProfileTarget clone() {
        try {
            return (SecurityProfileTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SecurityProfileTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}