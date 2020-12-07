/**
 * null
 */
package io.apigateway;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link io.apigateway.AwsApiGateway}.
 * 
 * @see io.apigateway.AwsApiGateway#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class AwsApiGatewayClientBuilder extends SdkSyncClientBuilder<AwsApiGatewayClientBuilder, AwsApiGateway> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "";

    /**
     * Package private constructor - builder should be created via {@link AwsApiGateway#builder()}
     */
    AwsApiGatewayClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of AwsApiGateway using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of AwsApiGateway.
     */
    @Override
    protected AwsApiGateway build(AwsSyncClientParams params) {
        return new AwsApiGatewayClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
