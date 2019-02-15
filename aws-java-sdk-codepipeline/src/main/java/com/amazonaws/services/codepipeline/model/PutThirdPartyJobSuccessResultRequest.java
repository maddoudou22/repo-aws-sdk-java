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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a PutThirdPartyJobSuccessResult action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobSuccessResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutThirdPartyJobSuccessResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Represents information about a current revision.
     * </p>
     */
    private CurrentRevision currentRevision;
    /**
     * <p>
     * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to
     * identify a partner action in progress. Future jobs will use this token in order to identify the running instance
     * of the action. It can be reused to return additional information about the progress of the partner action. When
     * the action is complete, no continuation token should be supplied.
     * </p>
     */
    private String continuationToken;
    /**
     * <p>
     * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
     * </p>
     */
    private ExecutionDetails executionDetails;

    /**
     * <p>
     * The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     * 
     * @param jobId
     *        The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     * 
     * @return The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     * 
     * @param jobId
     *        The ID of the job that successfully completed. This is the same ID returned from PollForThirdPartyJobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobSuccessResultRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @param clientToken
     *        The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *        allowed access to the job and its details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @return The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *         allowed access to the job and its details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @param clientToken
     *        The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *        allowed access to the job and its details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobSuccessResultRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Represents information about a current revision.
     * </p>
     * 
     * @param currentRevision
     *        Represents information about a current revision.
     */

    public void setCurrentRevision(CurrentRevision currentRevision) {
        this.currentRevision = currentRevision;
    }

    /**
     * <p>
     * Represents information about a current revision.
     * </p>
     * 
     * @return Represents information about a current revision.
     */

    public CurrentRevision getCurrentRevision() {
        return this.currentRevision;
    }

    /**
     * <p>
     * Represents information about a current revision.
     * </p>
     * 
     * @param currentRevision
     *        Represents information about a current revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobSuccessResultRequest withCurrentRevision(CurrentRevision currentRevision) {
        setCurrentRevision(currentRevision);
        return this;
    }

    /**
     * <p>
     * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to
     * identify a partner action in progress. Future jobs will use this token in order to identify the running instance
     * of the action. It can be reused to return additional information about the progress of the partner action. When
     * the action is complete, no continuation token should be supplied.
     * </p>
     * 
     * @param continuationToken
     *        A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides
     *        to identify a partner action in progress. Future jobs will use this token in order to identify the running
     *        instance of the action. It can be reused to return additional information about the progress of the
     *        partner action. When the action is complete, no continuation token should be supplied.
     */

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to
     * identify a partner action in progress. Future jobs will use this token in order to identify the running instance
     * of the action. It can be reused to return additional information about the progress of the partner action. When
     * the action is complete, no continuation token should be supplied.
     * </p>
     * 
     * @return A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job
     *         provides to identify a partner action in progress. Future jobs will use this token in order to identify
     *         the running instance of the action. It can be reused to return additional information about the progress
     *         of the partner action. When the action is complete, no continuation token should be supplied.
     */

    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * <p>
     * A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides to
     * identify a partner action in progress. Future jobs will use this token in order to identify the running instance
     * of the action. It can be reused to return additional information about the progress of the partner action. When
     * the action is complete, no continuation token should be supplied.
     * </p>
     * 
     * @param continuationToken
     *        A token generated by a job worker, such as an AWS CodeDeploy deployment ID, that a successful job provides
     *        to identify a partner action in progress. Future jobs will use this token in order to identify the running
     *        instance of the action. It can be reused to return additional information about the progress of the
     *        partner action. When the action is complete, no continuation token should be supplied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobSuccessResultRequest withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }

    /**
     * <p>
     * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
     * </p>
     * 
     * @param executionDetails
     *        The details of the actions taken and results produced on an artifact as it passes through stages in the
     *        pipeline.
     */

    public void setExecutionDetails(ExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
    }

    /**
     * <p>
     * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
     * </p>
     * 
     * @return The details of the actions taken and results produced on an artifact as it passes through stages in the
     *         pipeline.
     */

    public ExecutionDetails getExecutionDetails() {
        return this.executionDetails;
    }

    /**
     * <p>
     * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
     * </p>
     * 
     * @param executionDetails
     *        The details of the actions taken and results produced on an artifact as it passes through stages in the
     *        pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobSuccessResultRequest withExecutionDetails(ExecutionDetails executionDetails) {
        setExecutionDetails(executionDetails);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCurrentRevision() != null)
            sb.append("CurrentRevision: ").append(getCurrentRevision()).append(",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: ").append(getContinuationToken()).append(",");
        if (getExecutionDetails() != null)
            sb.append("ExecutionDetails: ").append(getExecutionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutThirdPartyJobSuccessResultRequest == false)
            return false;
        PutThirdPartyJobSuccessResultRequest other = (PutThirdPartyJobSuccessResultRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCurrentRevision() == null ^ this.getCurrentRevision() == null)
            return false;
        if (other.getCurrentRevision() != null && other.getCurrentRevision().equals(this.getCurrentRevision()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getExecutionDetails() == null ^ this.getExecutionDetails() == null)
            return false;
        if (other.getExecutionDetails() != null && other.getExecutionDetails().equals(this.getExecutionDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCurrentRevision() == null) ? 0 : getCurrentRevision().hashCode());
        hashCode = prime * hashCode + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionDetails() == null) ? 0 : getExecutionDetails().hashCode());
        return hashCode;
    }

    @Override
    public PutThirdPartyJobSuccessResultRequest clone() {
        return (PutThirdPartyJobSuccessResultRequest) super.clone();
    }

}
