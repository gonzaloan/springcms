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

    /**
     * Añade una nueva review hecha por un usuario
     *
     * @param userId: Identificador del usuario
     * @param status: Status de la review
     * @return la nueva REview creada.
     */
    public Review review(String userId, String status) {
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }

    /**
     * Verifica si la news fue revisada y aprobada por todos los reviewers
     *
     * @return TRUE si está Revisada o FALSE si no.
     */
    public Boolean revised() {
        return this.mandatoryReviewers.stream()
                .allMatch(reviewer -> this.reviewers.stream()
                        .anyMatch(review -> reviewer.id.equals(review.userId) &&
                                "approved".equals(review.status))
                );
    }
}
