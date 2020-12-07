/**
 * null
 */
package io.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/1xpyc9o5e1-2016-08-18T18:08:34Z/GetGetpresignedurlforupload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGetpresignedurlforuploadResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private PresignedUrlResponse presignedUrlResponse;

    /**
     * @param presignedUrlResponse
     */

    public void setPresignedUrlResponse(PresignedUrlResponse presignedUrlResponse) {
        this.presignedUrlResponse = presignedUrlResponse;
    }

    /**
     * @return
     */

    public PresignedUrlResponse getPresignedUrlResponse() {
        return this.presignedUrlResponse;
    }

    /**
     * @param presignedUrlResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGetpresignedurlforuploadResult presignedUrlResponse(PresignedUrlResponse presignedUrlResponse) {
        setPresignedUrlResponse(presignedUrlResponse);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPresignedUrlResponse() != null)
            sb.append("PresignedUrlResponse: ").append(getPresignedUrlResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGetpresignedurlforuploadResult == false)
            return false;
        GetGetpresignedurlforuploadResult other = (GetGetpresignedurlforuploadResult) obj;
        if (other.getPresignedUrlResponse() == null ^ this.getPresignedUrlResponse() == null)
            return false;
        if (other.getPresignedUrlResponse() != null && other.getPresignedUrlResponse().equals(this.getPresignedUrlResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresignedUrlResponse() == null) ? 0 : getPresignedUrlResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetGetpresignedurlforuploadResult clone() {
        try {
            return (GetGetpresignedurlforuploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
