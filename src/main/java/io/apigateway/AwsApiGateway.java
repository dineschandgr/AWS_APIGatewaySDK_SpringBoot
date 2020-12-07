/**
 * null
 */
package io.apigateway;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import io.apigateway.model.*;

/**
 * Interface for accessing AwsApiGateway.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AwsApiGateway {

    /**
     * @param getGetpresignedurlforuploadRequest
     * @return Result of the GetGetpresignedurlforupload operation returned by the service.
     * @sample AwsApiGateway.GetGetpresignedurlforupload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/1xpyc9o5e1-2016-08-18T18:08:34Z/GetGetpresignedurlforupload"
     *      target="_top">AWS API Documentation</a>
     */
    GetGetpresignedurlforuploadResult getGetpresignedurlforupload(GetGetpresignedurlforuploadRequest getGetpresignedurlforuploadRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AwsApiGatewayClientBuilder builder() {
        return new AwsApiGatewayClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
