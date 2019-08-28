package cl.gmunoz.springcms.controller;

import cl.gmunoz.springcms.model.User;
import cl.gmunoz.springcms.vo.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public User findOne(@PathVariable("id") String id) {
        return User.builder().build();
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public List<User> findAll() {
        return Arrays.asList(User.builder().build(), User.builder().build());
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public User newUser(UserRequest user) {
        return User.builder().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @ResponseBody
    public void removeUser(@PathVariable("id") String id) {

    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public User updateUser(@PathVariable("id") String id, UserRequest user) {
        return User.builder().build();
    }


}
