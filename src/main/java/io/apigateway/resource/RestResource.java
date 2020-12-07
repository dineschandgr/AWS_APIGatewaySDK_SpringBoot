package io.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.apigateway.model.FileUploadParams;
import io.apigateway.model.GetGetpresignedurlforuploadRequest;
import io.apigateway.model.GetGetpresignedurlforuploadResult;
import io.apigateway.model.PresignedUrlResponse;

@RestController
@RequestMapping("/api")
public class RestResource {
	
	@GetMapping("/hello")
	public String getResource(){
		System.out.println("Hello World");
		return "Hello World";
	}
	
	@GetMapping("/presignedUrlForUpload")
	public PresignedUrlResponse presignedUrlForUpload(){
		 System.out.println( "getPresignedUrlForUpload API Call");
		 GetGetpresignedurlforuploadRequest uploadRequest = new GetGetpresignedurlforuploadRequest();
		 uploadRequest.setBucket("poc-uploadtmp");
		 uploadRequest.setFile("test.txt");
		 AwsApiGateway client = AwsApiGateway.builder().build();
		 GetGetpresignedurlforuploadResult result = client.getGetpresignedurlforupload(uploadRequest);
	     return result.getPresignedUrlResponse();
	}
	
	@PostMapping("/presignedUrlForUpload")
	public PresignedUrlResponse presignedUrlForUploadPost(@RequestBody FileUploadParams fileParams){
		 System.out.println( "getPresignedUrlForUpload API Call");
		 GetGetpresignedurlforuploadRequest uploadRequest = new GetGetpresignedurlforuploadRequest();
		 uploadRequest.setBucket(fileParams.getBucketName());
		 uploadRequest.setFile(fileParams.getFileName());
		 AwsApiGateway client = AwsApiGateway.builder().build();
		 GetGetpresignedurlforuploadResult result = client.getGetpresignedurlforupload(uploadRequest);
	     return result.getPresignedUrlResponse();
	}
	
	
}
