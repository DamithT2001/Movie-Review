package com.DamithT.movies.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
