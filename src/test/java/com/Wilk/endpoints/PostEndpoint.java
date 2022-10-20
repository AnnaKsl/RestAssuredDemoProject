package com.Wilk.endpoints;

import com.Wilk.models.PostDto;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Component
public class PostEndpoint {

    @Autowired
    BaseEndpoint baseEndpoint;
    String POST_URI = "posts";

    public Response createNewPost() {
        PostDto postDto = new PostDto(1, 2, "Title", "Body");
        Response response = given().body(postDto)
                .post(baseEndpoint.getBaseEndPoint() + POST_URI).then().log().all().extract().response();
        return response;
    }

    public Response deletePost(int postId) {
        return given().delete(baseEndpoint.getBaseEndPoint() + POST_URI + "/" + postId).then().log().all().extract().response();
    }
}
