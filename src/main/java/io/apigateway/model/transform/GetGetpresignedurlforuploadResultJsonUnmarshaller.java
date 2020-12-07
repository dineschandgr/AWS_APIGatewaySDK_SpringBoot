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
 * GetGetpresignedurlforuploadResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGetpresignedurlforuploadResultJsonUnmarshaller implements Unmarshaller<GetGetpresignedurlforuploadResult, JsonUnmarshallerContext> {

    public GetGetpresignedurlforuploadResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetGetpresignedurlforuploadResult getGetpresignedurlforuploadResult = new GetGetpresignedurlforuploadResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getGetpresignedurlforuploadResult;
        }

        while (true) {
            if (token == null)
                break;

            getGetpresignedurlforuploadResult.setPresignedUrlResponse(PresignedUrlResponseJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getGetpresignedurlforuploadResult;
    }

    private static GetGetpresignedurlforuploadResultJsonUnmarshaller instance;

    public static GetGetpresignedurlforuploadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetGetpresignedurlforuploadResultJsonUnmarshaller();
        return instance;
    }
}
