package com.Wilk.models;

import lombok.Data;

@Data
public class PostDto {

    int userID;
    int id;
    String title;
    String body;

    public PostDto(int id, int userID, String title, String body){
        this.id = id;
        this.userID = userID;
        this.title = title;
        this.body = body;
    }

}
