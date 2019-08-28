package cl.gmunoz.springcms.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String id;
    String identity;
    String name;
    Role role;
}
