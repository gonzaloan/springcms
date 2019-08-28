package cl.gmunoz.springcms.model;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class News {
    String id;
    String title;
    String content;
    User author;
    Set<User> mandatoryReviewers;
    Set<Review> reviewers;

    public Review review(String userId, String status) {
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }
}
