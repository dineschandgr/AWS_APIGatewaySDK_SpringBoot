/**
 * null
 */
package io.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import io.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetGetpresignedurlforuploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetGetpresignedurlforuploadRequestMarshaller {

    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("bucket").build();
    private static final MarshallingInfo<String> FILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("file").build();

    private static final GetGetpresignedurlforuploadRequestMarshaller instance = new GetGetpresignedurlforuploadRequestMarshaller();

    public static GetGetpresignedurlforuploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetGetpresignedurlforuploadRequest getGetpresignedurlforuploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (getGetpresignedurlforuploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getGetpresignedurlforuploadRequest.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(getGetpresignedurlforuploadRequest.getFile(), FILE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
