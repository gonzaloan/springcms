package cl.gmunoz.springcms.vo;

import cl.gmunoz.springcms.model.Review;
import cl.gmunoz.springcms.model.User;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class NewsRequest {
    String title;
    String content;
    User author;
    Set<User> mandatoryReviewers;
    Set<Review> reviewers;
}
