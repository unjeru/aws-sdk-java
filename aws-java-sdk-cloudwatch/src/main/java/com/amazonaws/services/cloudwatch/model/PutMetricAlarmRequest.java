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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class PutMetricAlarmRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The description for the alarm.
     * </p>
     */
    private String alarmDescription;
    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     */
    private Boolean actionsEnabled;
    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> oKActions;
    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmActions;
    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insufficientDataActions;
    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace for the alarm's associated metric.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     */
    private String comparisonOperator;

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm. This name must be unique
     *        within the user's AWS account
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * 
     * @return The descriptive name for the alarm. This name must be unique
     *         within the user's AWS account
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm. This name must be unique
     *        within the user's AWS account
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description for the alarm.
     */

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * 
     * @return The description for the alarm.
     */

    public String getAlarmDescription() {
        return this.alarmDescription;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description for the alarm.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withAlarmDescription(String alarmDescription) {
        setAlarmDescription(alarmDescription);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether or not actions should be executed during any
     *        changes to the alarm's state.
     */

    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     * 
     * @return Indicates whether or not actions should be executed during any
     *         changes to the alarm's state.
     */

    public Boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether or not actions should be executed during any
     *        changes to the alarm's state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withActionsEnabled(Boolean actionsEnabled) {
        setActionsEnabled(actionsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     * 
     * @return Indicates whether or not actions should be executed during any
     *         changes to the alarm's state.
     */

    public Boolean isActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @return The list of actions to execute when this alarm transitions into
     *         an <code>OK</code> state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN). </p>
     *         <p>
     *         Valid Values: arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:recover
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         arn:aws:swf:us-east-1:{<i>customer
     *         -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *         arn:aws
     *         :swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *         .InstanceId.Terminate/1.0 |
     *         arn:aws:swf:us-east-1:{<i>customer-account
     *         </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *         </p>
     *         <p>
     *         <b>Note:</b> You must create at least one stop, terminate, or
     *         reboot alarm using the Amazon EC2 or CloudWatch console to create
     *         the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *         this IAM role is created, you can create stop, terminate, or
     *         reboot alarms using the CLI.
     */

    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
            oKActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return oKActions;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @param oKActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>OK</code> state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     */

    public void setOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
            return;
        }

        this.oKActions = new com.amazonaws.internal.SdkInternalList<String>(
                oKActions);
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOKActions(java.util.Collection)} or
     * {@link #withOKActions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param oKActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>OK</code> state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withOKActions(String... oKActions) {
        if (this.oKActions == null) {
            setOKActions(new com.amazonaws.internal.SdkInternalList<String>(
                    oKActions.length));
        }
        for (String ele : oKActions) {
            this.oKActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @param oKActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>OK</code> state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withOKActions(
            java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @return The list of actions to execute when this alarm transitions into
     *         an <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN). </p>
     *         <p>
     *         Valid Values: arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:recover
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         arn:aws:swf:us-east-1:{<i>customer
     *         -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *         arn:aws
     *         :swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *         .InstanceId.Terminate/1.0 |
     *         arn:aws:swf:us-east-1:{<i>customer-account
     *         </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *         </p>
     *         <p>
     *         <b>Note:</b> You must create at least one stop, terminate, or
     *         reboot alarm using the Amazon EC2 or CloudWatch console to create
     *         the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *         this IAM role is created, you can create stop, terminate, or
     *         reboot alarms using the CLI.
     */

    public java.util.List<String> getAlarmActions() {
        if (alarmActions == null) {
            alarmActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmActions;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @param alarmActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>ALARM</code> state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     */

    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new com.amazonaws.internal.SdkInternalList<String>(
                alarmActions);
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAlarmActions(java.util.Collection)} or
     * {@link #withAlarmActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param alarmActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>ALARM</code> state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withAlarmActions(String... alarmActions) {
        if (this.alarmActions == null) {
            setAlarmActions(new com.amazonaws.internal.SdkInternalList<String>(
                    alarmActions.length));
        }
        for (String ele : alarmActions) {
            this.alarmActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @param alarmActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>ALARM</code> state from any other state. Each action is
     *        specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withAlarmActions(
            java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @return The list of actions to execute when this alarm transitions into
     *         an <code>INSUFFICIENT_DATA</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN). </p>
     *         <p>
     *         Valid Values: arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:recover
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         arn:aws:swf:us-east-1:{<i>customer
     *         -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *         arn:aws
     *         :swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *         .InstanceId.Terminate/1.0 |
     *         arn:aws:swf:us-east-1:{<i>customer-account
     *         </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *         </p>
     *         <p>
     *         <b>Note:</b> You must create at least one stop, terminate, or
     *         reboot alarm using the Amazon EC2 or CloudWatch console to create
     *         the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *         this IAM role is created, you can create stop, terminate, or
     *         reboot alarms using the CLI.
     */

    public java.util.List<String> getInsufficientDataActions() {
        if (insufficientDataActions == null) {
            insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return insufficientDataActions;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @param insufficientDataActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>INSUFFICIENT_DATA</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     */

    public void setInsufficientDataActions(
            java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }

        this.insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>(
                insufficientDataActions);
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInsufficientDataActions(java.util.Collection)} or
     * {@link #withInsufficientDataActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param insufficientDataActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>INSUFFICIENT_DATA</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withInsufficientDataActions(
            String... insufficientDataActions) {
        if (this.insufficientDataActions == null) {
            setInsufficientDataActions(new com.amazonaws.internal.SdkInternalList<String>(
                    insufficientDataActions.length));
        }
        for (String ele : insufficientDataActions) {
            this.insufficientDataActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     * 
     * @param insufficientDataActions
     *        The list of actions to execute when this alarm transitions into an
     *        <code>INSUFFICIENT_DATA</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN). </p>
     *        <p>
     *        Valid Values: arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *        us-east-1)</i>:ec2:recover
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        arn:aws:swf:us-east-1:{<i>customer
     *        -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *        arn:aws:
     *        swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *        .InstanceId.Terminate/1.0 |
     *        arn:aws:swf:us-east-1:{<i>customer-account
     *        </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *        </p>
     *        <p>
     *        <b>Note:</b> You must create at least one stop, terminate, or
     *        reboot alarm using the Amazon EC2 or CloudWatch console to create
     *        the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *        this IAM role is created, you can create stop, terminate, or
     *        reboot alarms using the CLI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withInsufficientDataActions(
            java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * 
     * @param metricName
     *        The name for the alarm's associated metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * 
     * @return The name for the alarm's associated metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * 
     * @param metricName
     *        The name for the alarm's associated metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace for the alarm's associated metric.
     * </p>
     * 
     * @param namespace
     *        The namespace for the alarm's associated metric.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the alarm's associated metric.
     * </p>
     * 
     * @return The namespace for the alarm's associated metric.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace for the alarm's associated metric.
     * </p>
     * 
     * @param namespace
     *        The namespace for the alarm's associated metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the alarm's associated metric.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * 
     * @return The statistic to apply to the alarm's associated metric.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the alarm's associated metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public PutMetricAlarmRequest withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the alarm's associated metric.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the alarm's associated metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public PutMetricAlarmRequest withStatistic(Statistic statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     * 
     * @return The dimensions for the alarm's associated metric.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the alarm's associated metric.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(
                dimensions);
    }

    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDimensions(java.util.Collection)} or
     * {@link #withDimensions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the alarm's associated metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(
                    dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the alarm's associated metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withDimensions(
            java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * 
     * @param period
     *        The period in seconds over which the specified statistic is
     *        applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * 
     * @return The period in seconds over which the specified statistic is
     *         applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * 
     * @param period
     *        The period in seconds over which the specified statistic is
     *        applied.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * </p>
     * 
     * @param unit
     *        The statistic's unit of measure. For example, the units for the
     *        Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the
     *        number of bytes that an instance receives on all network
     *        interfaces. You can also specify a unit when you create a custom
     *        metric. Units help provide conceptual meaning to your data. Metric
     *        data points that specify a unit of measure, such as Percent, are
     *        aggregated separately. </p>
     *        <p>
     *        <b>Note:</b> If you specify a unit, you must use a unit that is
     *        appropriate for the metric. Otherwise, this can cause an Amazon
     *        CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * </p>
     * 
     * @return The statistic's unit of measure. For example, the units for the
     *         Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks
     *         the number of bytes that an instance receives on all network
     *         interfaces. You can also specify a unit when you create a custom
     *         metric. Units help provide conceptual meaning to your data.
     *         Metric data points that specify a unit of measure, such as
     *         Percent, are aggregated separately. </p>
     *         <p>
     *         <b>Note:</b> If you specify a unit, you must use a unit that is
     *         appropriate for the metric. Otherwise, this can cause an Amazon
     *         CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * </p>
     * 
     * @param unit
     *        The statistic's unit of measure. For example, the units for the
     *        Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the
     *        number of bytes that an instance receives on all network
     *        interfaces. You can also specify a unit when you create a custom
     *        metric. Units help provide conceptual meaning to your data. Metric
     *        data points that specify a unit of measure, such as Percent, are
     *        aggregated separately. </p>
     *        <p>
     *        <b>Note:</b> If you specify a unit, you must use a unit that is
     *        appropriate for the metric. Otherwise, this can cause an Amazon
     *        CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public PutMetricAlarmRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * </p>
     * 
     * @param unit
     *        The statistic's unit of measure. For example, the units for the
     *        Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the
     *        number of bytes that an instance receives on all network
     *        interfaces. You can also specify a unit when you create a custom
     *        metric. Units help provide conceptual meaning to your data. Metric
     *        data points that specify a unit of measure, such as Percent, are
     *        aggregated separately. </p>
     *        <p>
     *        <b>Note:</b> If you specify a unit, you must use a unit that is
     *        appropriate for the metric. Otherwise, this can cause an Amazon
     *        CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * </p>
     * 
     * @param unit
     *        The statistic's unit of measure. For example, the units for the
     *        Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the
     *        number of bytes that an instance receives on all network
     *        interfaces. You can also specify a unit when you create a custom
     *        metric. Units help provide conceptual meaning to your data. Metric
     *        data points that specify a unit of measure, such as Percent, are
     *        aggregated separately. </p>
     *        <p>
     *        <b>Note:</b> If you specify a unit, you must use a unit that is
     *        appropriate for the metric. Otherwise, this can cause an Amazon
     *        CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public PutMetricAlarmRequest withUnit(StandardUnit unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified
     *        threshold.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * 
     * @return The number of periods over which data is compared to the
     *         specified threshold.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified
     *        threshold.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @return The value against which the specified statistic is compared.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutMetricAlarmRequest withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        <code>Statistic</code> and <code>Threshold</code>. The specified
     *        <code>Statistic</code> value is used as the first operand.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * 
     * @return The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        <code>Statistic</code> and <code>Threshold</code>. The specified
     *        <code>Statistic</code> value is used as the first operand.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */

    public PutMetricAlarmRequest withComparisonOperator(
            String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        <code>Statistic</code> and <code>Threshold</code>. The specified
     *        <code>Statistic</code> value is used as the first operand.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        <code>Statistic</code> and <code>Threshold</code>. The specified
     *        <code>Statistic</code> value is used as the first operand.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */

    public PutMetricAlarmRequest withComparisonOperator(
            ComparisonOperator comparisonOperator) {
        setComparisonOperator(comparisonOperator);
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
        if (getAlarmName() != null)
            sb.append("AlarmName: " + getAlarmName() + ",");
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: " + getAlarmDescription() + ",");
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: " + getActionsEnabled() + ",");
        if (getOKActions() != null)
            sb.append("OKActions: " + getOKActions() + ",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: " + getAlarmActions() + ",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: "
                    + getInsufficientDataActions() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit() + ",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricAlarmRequest == false)
            return false;
        PutMetricAlarmRequest other = (PutMetricAlarmRequest) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmDescription() == null
                ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null
                && other.getAlarmDescription().equals(
                        this.getAlarmDescription()) == false)
            return false;
        if (other.getActionsEnabled() == null
                ^ this.getActionsEnabled() == null)
            return false;
        if (other.getActionsEnabled() != null
                && other.getActionsEnabled().equals(this.getActionsEnabled()) == false)
            return false;
        if (other.getOKActions() == null ^ this.getOKActions() == null)
            return false;
        if (other.getOKActions() != null
                && other.getOKActions().equals(this.getOKActions()) == false)
            return false;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null
                && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        if (other.getInsufficientDataActions() == null
                ^ this.getInsufficientDataActions() == null)
            return false;
        if (other.getInsufficientDataActions() != null
                && other.getInsufficientDataActions().equals(
                        this.getInsufficientDataActions()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null
                && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null
                && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getEvaluationPeriods() == null
                ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(
                        this.getEvaluationPeriods()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null
                ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(
                        this.getComparisonOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlarmDescription() == null) ? 0 : getAlarmDescription()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getActionsEnabled() == null) ? 0 : getActionsEnabled()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlarmActions() == null) ? 0 : getAlarmActions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInsufficientDataActions() == null) ? 0
                        : getInsufficientDataActions().hashCode());
        hashCode = prime * hashCode
                + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode
                + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode
                + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluationPeriods() == null) ? 0
                        : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode
                + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime
                * hashCode
                + ((getComparisonOperator() == null) ? 0
                        : getComparisonOperator().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricAlarmRequest clone() {
        return (PutMetricAlarmRequest) super.clone();
    }
}