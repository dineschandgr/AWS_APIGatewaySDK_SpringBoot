/**
 * null
 */
package io.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import io.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PresignedUrlResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PresignedUrlResponseJsonUnmarshaller implements Unmarshaller<PresignedUrlResponse, JsonUnmarshallerContext> {

    public PresignedUrlResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        PresignedUrlResponse presignedUrlResponse = new PresignedUrlResponse();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AWSAccessKeyId", targetDepth)) {
                    context.nextToken();
                    presignedUrlResponse.setAWSAccessKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("x-amz-security-token", targetDepth)) {
                    context.nextToken();
                    presignedUrlResponse.setAmzSecurityToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    presignedUrlResponse.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policy", targetDepth)) {
                    context.nextToken();
                    presignedUrlResponse.setPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signature", targetDepth)) {
                    context.nextToken();
                    presignedUrlResponse.setSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    presignedUrlResponse.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return presignedUrlResponse;
    }

    private static PresignedUrlResponseJsonUnmarshaller instance;

    public static PresignedUrlResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PresignedUrlResponseJsonUnmarshaller();
        return instance;
    }
}
