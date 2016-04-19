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

package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the result of a list device pools request.
 * </p>
 */
public class ListDevicePoolsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The project ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The device pools' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool
     * developer.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The project ARN.
     * </p>
     * 
     * @param arn
     *        The project ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The project ARN.
     * </p>
     * 
     * @return The project ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The project ARN.
     * </p>
     * 
     * @param arn
     *        The project ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDevicePoolsRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The device pools' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool
     * developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pools' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device
     *        Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device
     *        pool developer.
     *        </p>
     *        </li>
     * @see DevicePoolType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The device pools' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool
     * developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The device pools' type.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CURATED: A device pool that is created and managed by AWS Device
     *         Farm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRIVATE: A device pool that is created and managed by the device
     *         pool developer.
     *         </p>
     *         </li>
     * @see DevicePoolType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The device pools' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool
     * developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pools' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device
     *        Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device
     *        pool developer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DevicePoolType
     */

    public ListDevicePoolsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The device pools' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool
     * developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pools' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device
     *        Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device
     *        pool developer.
     *        </p>
     *        </li>
     * @see DevicePoolType
     */

    public void setType(DevicePoolType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The device pools' type.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CURATED: A device pool that is created and managed by AWS Device Farm.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRIVATE: A device pool that is created and managed by the device pool
     * developer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The device pools' type.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CURATED: A device pool that is created and managed by AWS Device
     *        Farm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRIVATE: A device pool that is created and managed by the device
     *        pool developer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DevicePoolType
     */

    public ListDevicePoolsRequest withType(DevicePoolType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this
     *        operation, which can be used to return the next set of items in
     *        the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in
     *         the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this
     *        operation, which can be used to return the next set of items in
     *        the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDevicePoolsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicePoolsRequest == false)
            return false;
        ListDevicePoolsRequest other = (ListDevicePoolsRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null
                && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicePoolsRequest clone() {
        return (ListDevicePoolsRequest) super.clone();
    }
}