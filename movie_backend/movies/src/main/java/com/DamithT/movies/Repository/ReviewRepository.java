package com.DamithT.movies.Repository;

import com.DamithT.movies.Model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
