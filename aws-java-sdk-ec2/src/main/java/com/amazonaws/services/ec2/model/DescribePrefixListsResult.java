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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribePrefixLists.
 * </p>
 */
public class DescribePrefixListsResult implements Serializable, Cloneable {

    /**
     * <p>
     * All available prefix lists.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrefixList> prefixLists;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * All available prefix lists.
     * </p>
     * 
     * @return All available prefix lists.
     */

    public java.util.List<PrefixList> getPrefixLists() {
        if (prefixLists == null) {
            prefixLists = new com.amazonaws.internal.SdkInternalList<PrefixList>();
        }
        return prefixLists;
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     * 
     * @param prefixLists
     *        All available prefix lists.
     */

    public void setPrefixLists(java.util.Collection<PrefixList> prefixLists) {
        if (prefixLists == null) {
            this.prefixLists = null;
            return;
        }

        this.prefixLists = new com.amazonaws.internal.SdkInternalList<PrefixList>(
                prefixLists);
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrefixLists(java.util.Collection)} or
     * {@link #withPrefixLists(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param prefixLists
     *        All available prefix lists.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsResult withPrefixLists(PrefixList... prefixLists) {
        if (this.prefixLists == null) {
            setPrefixLists(new com.amazonaws.internal.SdkInternalList<PrefixList>(
                    prefixLists.length));
        }
        for (PrefixList ele : prefixLists) {
            this.prefixLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All available prefix lists.
     * </p>
     * 
     * @param prefixLists
     *        All available prefix lists.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsResult withPrefixLists(
            java.util.Collection<PrefixList> prefixLists) {
        setPrefixLists(prefixLists);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there
     *        are no additional items to return, the string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there
     *        are no additional items to return, the string is empty.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsResult withNextToken(String nextToken) {
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
        if (getPrefixLists() != null)
            sb.append("PrefixLists: " + getPrefixLists() + ",");
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

        if (obj instanceof DescribePrefixListsResult == false)
            return false;
        DescribePrefixListsResult other = (DescribePrefixListsResult) obj;
        if (other.getPrefixLists() == null ^ this.getPrefixLists() == null)
            return false;
        if (other.getPrefixLists() != null
                && other.getPrefixLists().equals(this.getPrefixLists()) == false)
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

        hashCode = prime
                * hashCode
                + ((getPrefixLists() == null) ? 0 : getPrefixLists().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePrefixListsResult clone() {
        try {
            return (DescribePrefixListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}