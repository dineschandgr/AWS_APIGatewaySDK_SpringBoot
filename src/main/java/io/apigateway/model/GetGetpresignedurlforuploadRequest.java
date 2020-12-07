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
public class GetGetpresignedurlforuploadRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String bucket;

    private String file;

    /**
     * @param bucket
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * @return
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * @param bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGetpresignedurlforuploadRequest bucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * @param file
     */

    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return
     */

    public String getFile() {
        return this.file;
    }

    /**
     * @param file
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGetpresignedurlforuploadRequest file(String file) {
        setFile(file);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getFile() != null)
            sb.append("File: ").append(getFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGetpresignedurlforuploadRequest == false)
            return false;
        GetGetpresignedurlforuploadRequest other = (GetGetpresignedurlforuploadRequest) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        return hashCode;
    }

    @Override
    public GetGetpresignedurlforuploadRequest clone() {
        return (GetGetpresignedurlforuploadRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetGetpresignedurlforuploadRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
