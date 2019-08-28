package cl.gmunoz.springcms.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review {
    String userId;
    String status;
}
