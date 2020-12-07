/**
 * null
 */
package io.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/1xpyc9o5e1-2016-08-18T18:08:34Z/PresignedUrlResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PresignedUrlResponse implements Serializable, Cloneable, StructuredPojo {

    private String aWSAccessKeyId;

    private String amzSecurityToken;

    private String key;

    private String policy;

    private String signature;

    private String url;

    /**
     * @param aWSAccessKeyId
     */

    public void setAWSAccessKeyId(String aWSAccessKeyId) {
        this.aWSAccessKeyId = aWSAccessKeyId;
    }

    /**
     * @return
     */

    public String getAWSAccessKeyId() {
        return this.aWSAccessKeyId;
    }

    /**
     * @param aWSAccessKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlResponse aWSAccessKeyId(String aWSAccessKeyId) {
        setAWSAccessKeyId(aWSAccessKeyId);
        return this;
    }

    /**
     * @param amzSecurityToken
     */

    public void setAmzSecurityToken(String amzSecurityToken) {
        this.amzSecurityToken = amzSecurityToken;
    }

    /**
     * @return
     */

    public String getAmzSecurityToken() {
        return this.amzSecurityToken;
    }

    /**
     * @param amzSecurityToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlResponse amzSecurityToken(String amzSecurityToken) {
        setAmzSecurityToken(amzSecurityToken);
        return this;
    }

    /**
     * @param key
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return
     */

    public String getKey() {
        return this.key;
    }

    /**
     * @param key
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlResponse key(String key) {
        setKey(key);
        return this;
    }

    /**
     * @param policy
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * @return
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * @param policy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlResponse policy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * @param signature
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * @param signature
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlResponse signature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * @param url
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresignedUrlResponse url(String url) {
        setUrl(url);
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
        if (getAWSAccessKeyId() != null)
            sb.append("AWSAccessKeyId: ").append(getAWSAccessKeyId()).append(",");
        if (getAmzSecurityToken() != null)
            sb.append("AmzSecurityToken: ").append(getAmzSecurityToken()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresignedUrlResponse == false)
            return false;
        PresignedUrlResponse other = (PresignedUrlResponse) obj;
        if (other.getAWSAccessKeyId() == null ^ this.getAWSAccessKeyId() == null)
            return false;
        if (other.getAWSAccessKeyId() != null && other.getAWSAccessKeyId().equals(this.getAWSAccessKeyId()) == false)
            return false;
        if (other.getAmzSecurityToken() == null ^ this.getAmzSecurityToken() == null)
            return false;
        if (other.getAmzSecurityToken() != null && other.getAmzSecurityToken().equals(this.getAmzSecurityToken()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSAccessKeyId() == null) ? 0 : getAWSAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getAmzSecurityToken() == null) ? 0 : getAmzSecurityToken().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public PresignedUrlResponse clone() {
        try {
            return (PresignedUrlResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        io.apigateway.model.transform.PresignedUrlResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
