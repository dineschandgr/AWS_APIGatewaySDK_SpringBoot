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
 * PresignedUrlResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PresignedUrlResponseMarshaller {

    private static final MarshallingInfo<String> AWSACCESSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AWSAccessKeyId").build();
    private static final MarshallingInfo<String> AMZSECURITYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("x-amz-security-token").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<String> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("policy").build();
    private static final MarshallingInfo<String> SIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("signature").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("url").build();

    private static final PresignedUrlResponseMarshaller instance = new PresignedUrlResponseMarshaller();

    public static PresignedUrlResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PresignedUrlResponse presignedUrlResponse, ProtocolMarshaller protocolMarshaller) {

        if (presignedUrlResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(presignedUrlResponse.getAWSAccessKeyId(), AWSACCESSKEYID_BINDING);
            protocolMarshaller.marshall(presignedUrlResponse.getAmzSecurityToken(), AMZSECURITYTOKEN_BINDING);
            protocolMarshaller.marshall(presignedUrlResponse.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(presignedUrlResponse.getPolicy(), POLICY_BINDING);
            protocolMarshaller.marshall(presignedUrlResponse.getSignature(), SIGNATURE_BINDING);
            protocolMarshaller.marshall(presignedUrlResponse.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
