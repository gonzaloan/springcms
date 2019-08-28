package cl.gmunoz.springcms.vo;

import cl.gmunoz.springcms.model.Role;
import lombok.Builder;
import lombok.Data;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
