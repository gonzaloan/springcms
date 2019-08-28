package cl.gmunoz.springcms.service;

import cl.gmunoz.springcms.model.User;
import cl.gmunoz.springcms.repository.UserRepository;
import cl.gmunoz.springcms.vo.UserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User update(String id, UserRequest userRequest){
        final User user = this.userRepository.findOne(id);
        user.setIdentity(userRequest.getIdentity());
        user.setName(userRequest.getName());
        user.setRole(userRequest.getRole());
        return this.userRepository.save(user);
    }


}
