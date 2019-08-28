package cl.gmunoz.springcms.controller;

import cl.gmunoz.springcms.model.Category;
import cl.gmunoz.springcms.vo.CategoryRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public Category findOne(@PathVariable("id") String id) {
        return Category.builder().build();
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public List<Category> findAll() {
        return Arrays.asList(Category.builder().build(), Category.builder().build());
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public Category newCategory(CategoryRequest category) {
        return Category.builder().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @ResponseBody
    public void removeCategory(@PathVariable("id") String id) {

    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public Category updateCategory(@PathVariable("id") String id, CategoryRequest category) {
        return Category.builder().build();
    }


}
