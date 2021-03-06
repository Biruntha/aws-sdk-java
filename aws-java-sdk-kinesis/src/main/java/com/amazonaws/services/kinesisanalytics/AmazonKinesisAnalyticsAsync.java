/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics;

import com.amazonaws.services.kinesisanalytics.model.*;

/**
 * Interface for accessing Kinesis Analytics asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 */
public interface AmazonKinesisAnalyticsAsync extends AmazonKinesisAnalytics {

    /**
     * <p>
     * Adds a streaming source to your Amazon Kinesis application. For
     * conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html"
     * >Configuring Application Input</a>.
     * </p>
     * <p>
     * You can add a streaming source either when you create an application or
     * you can use this operation to add a streaming source after you create an
     * application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this
     * operation, results in a new version of the application. You can use the
     * <a>DescribeApplication</a> operation to find the current application
     * version.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:AddApplicationInput</code> action.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @return A Java Future containing the result of the AddApplicationInput
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.AddApplicationInput
     */
    java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(
            AddApplicationInputRequest addApplicationInputRequest);

    /**
     * <p>
     * Adds a streaming source to your Amazon Kinesis application. For
     * conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html"
     * >Configuring Application Input</a>.
     * </p>
     * <p>
     * You can add a streaming source either when you create an application or
     * you can use this operation to add a streaming source after you create an
     * application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this
     * operation, results in a new version of the application. You can use the
     * <a>DescribeApplication</a> operation to find the current application
     * version.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:AddApplicationInput</code> action.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationInput
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.AddApplicationInput
     */
    java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(
            AddApplicationInputRequest addApplicationInputRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationInputRequest, AddApplicationInputResult> asyncHandler);

    /**
     * <p>
     * Adds an external destination to your Amazon Kinesis Analytics
     * application.
     * </p>
     * <p>
     * If you want Amazon Kinesis Analytics to deliver data from an
     * in-application stream within your application to an external destination
     * (such as an Amazon Kinesis stream or a Firehose delivery stream), you add
     * the relevant configuration to your application using this operation. You
     * can configure one or more outputs for your application. Each output
     * configuration maps an in-application stream and an external destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your
     * in-application error stream to an external destination so that you can
     * analyze the errors. For conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html"
     * >Understanding Application Output (Destination)</a>.
     * </p>
     * <p>
     * Note that any configuration update, including adding a streaming source
     * using this operation, results in a new version of the application. You
     * can use the <a>DescribeApplication</a> operation to find the current
     * application version.
     * </p>
     * <p>
     * For the limits on the number of application inputs and outputs you can
     * configure, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @return A Java Future containing the result of the AddApplicationOutput
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.AddApplicationOutput
     */
    java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(
            AddApplicationOutputRequest addApplicationOutputRequest);

    /**
     * <p>
     * Adds an external destination to your Amazon Kinesis Analytics
     * application.
     * </p>
     * <p>
     * If you want Amazon Kinesis Analytics to deliver data from an
     * in-application stream within your application to an external destination
     * (such as an Amazon Kinesis stream or a Firehose delivery stream), you add
     * the relevant configuration to your application using this operation. You
     * can configure one or more outputs for your application. Each output
     * configuration maps an in-application stream and an external destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your
     * in-application error stream to an external destination so that you can
     * analyze the errors. For conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html"
     * >Understanding Application Output (Destination)</a>.
     * </p>
     * <p>
     * Note that any configuration update, including adding a streaming source
     * using this operation, results in a new version of the application. You
     * can use the <a>DescribeApplication</a> operation to find the current
     * application version.
     * </p>
     * <p>
     * For the limits on the number of application inputs and outputs you can
     * configure, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationOutput
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.AddApplicationOutput
     */
    java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(
            AddApplicationOutputRequest addApplicationOutputRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationOutputRequest, AddApplicationOutputResult> asyncHandler);

    /**
     * <p>
     * Adds a reference data source to an existing application.
     * </p>
     * <p>
     * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3
     * object) and creates an in-application table within your application. In
     * the request, you provide the source (S3 bucket name and object key name),
     * name of the in-application table to create, and the necessary mapping
     * information that describes how data in Amazon S3 object maps to columns
     * in the resulting in-application table.
     * </p>
     * <p>
     * For conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html"
     * >Configuring Application Input</a>. For the limits on data sources you
     * can add to your application, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @return A Java Future containing the result of the
     *         AddApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample AmazonKinesisAnalyticsAsync.AddApplicationReferenceDataSource
     */
    java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Adds a reference data source to an existing application.
     * </p>
     * <p>
     * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3
     * object) and creates an in-application table within your application. In
     * the request, you provide the source (S3 bucket name and object key name),
     * name of the in-application table to create, and the necessary mapping
     * information that describes how data in Amazon S3 object maps to columns
     * in the resulting in-application table.
     * </p>
     * <p>
     * For conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html"
     * >Configuring Application Input</a>. For the limits on data sources you
     * can add to your application, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html"
     * >Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         AddApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample 
     *         AmazonKinesisAnalyticsAsyncHandler.AddApplicationReferenceDataSource
     */
    java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationReferenceDataSourceRequest, AddApplicationReferenceDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Kinesis Analytics application. You can configure each
     * application with one streaming source as input, application code to
     * process the input, and up to five streaming destinations where you want
     * Amazon Kinesis Analytics to write the output data from your application.
     * For an overview, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works.html"
     * >How it Works</a>.
     * </p>
     * <p>
     * In the input configuration, you map the streaming source to an
     * in-application stream, which you can think of as a constantly updating
     * table. In the mapping, you must provide a schema for the in-application
     * stream and map each data column in the in-application stream to a data
     * element in the streaming source, with the option of renaming, casting and
     * dropping columns as desired.
     * </p>
     * <p>
     * Your application code is one or more SQL statements that read input data,
     * transform it, and generate output. Your application code can create one
     * or more SQL artifacts like SQL streams or pumps.
     * </p>
     * <p>
     * In the output configuration, you can configure the application to write
     * data from in-application streams created in your applications to up to
     * five streaming destinations.
     * </p>
     * <p>
     * To read data from your source stream or write data to destination
     * streams, Amazon Kinesis Analytics needs your permissions. You grant these
     * permissions by creating IAM roles. This operation requires permissions to
     * perform the <code>kinesisanalytics:CreateApplication</code> action.
     * </p>
     * <p>
     * For introductory exercises to create an Amazon Kinesis Analytics
     * application, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/getting-started.html"
     * >Getting Started</a>.
     * </p>
     * 
     * @param createApplicationRequest
     *        TBD
     * @return A Java Future containing the result of the CreateApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an Amazon Kinesis Analytics application. You can configure each
     * application with one streaming source as input, application code to
     * process the input, and up to five streaming destinations where you want
     * Amazon Kinesis Analytics to write the output data from your application.
     * For an overview, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works.html"
     * >How it Works</a>.
     * </p>
     * <p>
     * In the input configuration, you map the streaming source to an
     * in-application stream, which you can think of as a constantly updating
     * table. In the mapping, you must provide a schema for the in-application
     * stream and map each data column in the in-application stream to a data
     * element in the streaming source, with the option of renaming, casting and
     * dropping columns as desired.
     * </p>
     * <p>
     * Your application code is one or more SQL statements that read input data,
     * transform it, and generate output. Your application code can create one
     * or more SQL artifacts like SQL streams or pumps.
     * </p>
     * <p>
     * In the output configuration, you can configure the application to write
     * data from in-application streams created in your applications to up to
     * five streaming destinations.
     * </p>
     * <p>
     * To read data from your source stream or write data to destination
     * streams, Amazon Kinesis Analytics needs your permissions. You grant these
     * permissions by creating IAM roles. This operation requires permissions to
     * perform the <code>kinesisanalytics:CreateApplication</code> action.
     * </p>
     * <p>
     * For introductory exercises to create an Amazon Kinesis Analytics
     * application, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/getting-started.html"
     * >Getting Started</a>.
     * </p>
     * 
     * @param createApplicationRequest
     *        TBD
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified application. Amazon Kinesis Analytics halts
     * application execution and deletes the application, including any
     * application artifacts (such as in-application streams, reference table,
     * and application code).
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DeleteApplication</code> action.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.DeleteApplication
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(
            DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the specified application. Amazon Kinesis Analytics halts
     * application execution and deletes the application, including any
     * application artifacts (such as in-application streams, reference table,
     * and application code).
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DeleteApplication</code> action.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.DeleteApplication
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(
            DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes output destination configuration from your application
     * configuration. Amazon Kinesis Analytics will no longer write data from
     * the corresponding in-application stream to the external output
     * destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DeleteApplicationOutput</code> action.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @return A Java Future containing the result of the
     *         DeleteApplicationOutput operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.DeleteApplicationOutput
     */
    java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(
            DeleteApplicationOutputRequest deleteApplicationOutputRequest);

    /**
     * <p>
     * Deletes output destination configuration from your application
     * configuration. Amazon Kinesis Analytics will no longer write data from
     * the corresponding in-application stream to the external output
     * destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DeleteApplicationOutput</code> action.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteApplicationOutput operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.DeleteApplicationOutput
     */
    java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(
            DeleteApplicationOutputRequest deleteApplicationOutputRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationOutputRequest, DeleteApplicationOutputResult> asyncHandler);

    /**
     * <p>
     * Deletes a reference data source configuration from the specified
     * application configuration.
     * </p>
     * <p>
     * If the application is running, Amazon Kinesis Analytics immediately
     * removes the in-application table that you created using the
     * <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics.DeleteApplicationReferenceDataSource</code>
     * action.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @return A Java Future containing the result of the
     *         DeleteApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample AmazonKinesisAnalyticsAsync.DeleteApplicationReferenceDataSource
     */
    java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Deletes a reference data source configuration from the specified
     * application configuration.
     * </p>
     * <p>
     * If the application is running, Amazon Kinesis Analytics immediately
     * removes the in-application table that you created using the
     * <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics.DeleteApplicationReferenceDataSource</code>
     * action.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample 
     *         AmazonKinesisAnalyticsAsyncHandler.DeleteApplicationReferenceDataSource
     */
    java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationReferenceDataSourceRequest, DeleteApplicationReferenceDataSourceResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Analytics
     * application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use
     * the <a>ListApplications</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DescribeApplication</code> action. You can use
     * <code>DescribeApplication</code> to get the current application
     * versionId, which you need to call other operations such as
     * <code>Update</code>.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return A Java Future containing the result of the DescribeApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.DescribeApplication
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(
            DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Analytics
     * application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use
     * the <a>ListApplications</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DescribeApplication</code> action. You can use
     * <code>DescribeApplication</code> to get the current application
     * versionId, which you need to call other operations such as
     * <code>Update</code>.
     * </p>
     * 
     * @param describeApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.DescribeApplication
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(
            DescribeApplicationRequest describeApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler);

    /**
     * <p>
     * Infers a schema by evaluating sample records on the specified streaming
     * source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery
     * stream). In the response, the operation returns the inferred schema and
     * also the sample records that the operation used to infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for
     * your application. For conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html"
     * >Configuring Application Input</a>. Note that when you create an
     * application using the Amazon Kinesis Analytics console, the console uses
     * this operation to infer a schema and show it in the console user
     * interface.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DiscoverInputSchema</code> action.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @return A Java Future containing the result of the DiscoverInputSchema
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.DiscoverInputSchema
     */
    java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(
            DiscoverInputSchemaRequest discoverInputSchemaRequest);

    /**
     * <p>
     * Infers a schema by evaluating sample records on the specified streaming
     * source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery
     * stream). In the response, the operation returns the inferred schema and
     * also the sample records that the operation used to infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for
     * your application. For conceptual information, see <a href=
     * "http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html"
     * >Configuring Application Input</a>. Note that when you create an
     * application using the Amazon Kinesis Analytics console, the console uses
     * this operation to infer a schema and show it in the console user
     * interface.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:DiscoverInputSchema</code> action.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DiscoverInputSchema
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.DiscoverInputSchema
     */
    java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(
            DiscoverInputSchemaRequest discoverInputSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DiscoverInputSchemaRequest, DiscoverInputSchemaResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Amazon Kinesis Analytics applications in your account.
     * For each application, the response includes the application name, Amazon
     * Resource Name (ARN), and status. If the response returns the
     * <code>HasMoreApplications</code> value as true, you can send another
     * request by adding the <code>ExclusiveStartApplicationName</code> in the
     * request body, and set the value of this to the last application name from
     * the previous response.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use
     * <a>DescribeApplication</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:ListApplications</code> action.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.ListApplications
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Returns a list of Amazon Kinesis Analytics applications in your account.
     * For each application, the response includes the application name, Amazon
     * Resource Name (ARN), and status. If the response returns the
     * <code>HasMoreApplications</code> value as true, you can send another
     * request by adding the <code>ExclusiveStartApplicationName</code> in the
     * request body, and set the value of this to the last application name from
     * the previous response.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use
     * <a>DescribeApplication</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:ListApplications</code> action.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.ListApplications
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Starts the specified Amazon Kinesis Analytics application. After creating
     * an application, you must exclusively call this operation to start your
     * application.
     * </p>
     * <p>
     * After the application starts, it begins consuming the input data,
     * processes it, and writes the output to the configured destination.
     * </p>
     * <p>
     * The application status must be <code>READY</code> for you to start an
     * application. You can get the application status in the console or using
     * the <a>DescribeApplication</a> operation.
     * </p>
     * <p>
     * After you start the application, you can stop the application from
     * processing the input by calling the <a>StopApplication</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:StartApplication</code> action.
     * </p>
     * 
     * @param startApplicationRequest
     * @return A Java Future containing the result of the StartApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.StartApplication
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(
            StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Starts the specified Amazon Kinesis Analytics application. After creating
     * an application, you must exclusively call this operation to start your
     * application.
     * </p>
     * <p>
     * After the application starts, it begins consuming the input data,
     * processes it, and writes the output to the configured destination.
     * </p>
     * <p>
     * The application status must be <code>READY</code> for you to start an
     * application. You can get the application status in the console or using
     * the <a>DescribeApplication</a> operation.
     * </p>
     * <p>
     * After you start the application, you can stop the application from
     * processing the input by calling the <a>StopApplication</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:StartApplication</code> action.
     * </p>
     * 
     * @param startApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.StartApplication
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(
            StartApplicationRequest startApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler);

    /**
     * <p>
     * Stops the application from processing input data. You can stop an
     * application only if it is in the running state. You can use the
     * <a>DescribeApplication</a> operation to find the application state. After
     * the application is stopped, Amazon Kinesis Analytics stops reading data
     * from the input, the application stops processing data, and there is no
     * output written to the destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:StopApplication</code> action.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return A Java Future containing the result of the StopApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.StopApplication
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(
            StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Stops the application from processing input data. You can stop an
     * application only if it is in the running state. You can use the
     * <a>DescribeApplication</a> operation to find the application state. After
     * the application is stopped, Amazon Kinesis Analytics stops reading data
     * from the input, the application stops processing data, and there is no
     * output written to the destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics:StopApplication</code> action.
     * </p>
     * 
     * @param stopApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.StopApplication
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(
            StopApplicationRequest stopApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Kinesis Analytics application. Using this API, you
     * can update application code, input configuration, and output
     * configuration.
     * </p>
     * <p>
     * Note that Kinesis Analytics updates the
     * <code>CurrentApplicationVersionId</code> each time you update your
     * application.
     * </p>
     * <p>
     * This opeation requires permission for the
     * <code>kinesisanalytics:UpdateApplication</code> action.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsync.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an existing Kinesis Analytics application. Using this API, you
     * can update application code, input configuration, and output
     * configuration.
     * </p>
     * <p>
     * Note that Kinesis Analytics updates the
     * <code>CurrentApplicationVersionId</code> each time you update your
     * application.
     * </p>
     * <p>
     * This opeation requires permission for the
     * <code>kinesisanalytics:UpdateApplication</code> action.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication
     *         operation returned by the service.
     * @sample AmazonKinesisAnalyticsAsyncHandler.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

}
