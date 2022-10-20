package com.Wilk;

import com.Wilk.endpoints.PostEndpoint;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PostIT {

    //    ApplicationContext context
//            = new AnnotationConfigApplicationContext(Configuration.class);
//    PostEndpoint postEndpoint = (PostEndpoint) context.getBean("postEndpoint");
    @Autowired
    PostEndpoint postEndpoint;

    @Test
    public void verifyPostIsAdded() {
        Response response = postEndpoint.createNewPost();
        Assertions.assertEquals(HttpStatus.SC_CREATED, response.getStatusCode());
    }

    @Test
    public void verifyPostIsDeleted() {
        Response response = postEndpoint.deletePost(2);
        Assertions.assertEquals(HttpStatus.SC_OK,response.getStatusCode());
    }

}
