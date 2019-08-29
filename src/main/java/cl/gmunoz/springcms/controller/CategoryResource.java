package cl.gmunoz.springcms.controller;

import cl.gmunoz.springcms.model.Category;
import cl.gmunoz.springcms.vo.CategoryRequest;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/category")
@Api(tags = {"Category Resource"})
@SwaggerDefinition(tags = {
        @Tag(name = "Category Resource", description = "Category API")
})

public class CategoryResource {

    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    @ApiOperation(value = "Find Category", notes = "Find the category for the ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Category found"),
            @ApiResponse(code = 404, message = "Category Not Found")
    })
    public Category findOne(@PathVariable("id") String id) {
        return Category.builder().build();
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    @ApiOperation(value = "List Categories", notes = "List all categories")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Categories found"),
            @ApiResponse(code = 404, message = "Category not found")
    })
    public List<Category> findAll() {
        return Arrays.asList(Category.builder().build(), Category.builder().build());
    }


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    @ApiOperation(value = "Create Category", notes = "Creates a category")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Category created successfully"),
            @ApiResponse(code = 400, message = "Invalid Request")

    })
    public Category newCategory(CategoryRequest category) {
        return Category.builder().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @ResponseBody
    @ApiOperation(value = "Remove Category", notes = "Removes a category")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Category removed successfully"),
            @ApiResponse(code = 404, message = "Category not found")
    })
    public void removeCategory(@PathVariable("id") String id) {

    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    @ApiOperation(value = "Update Category", notes = "Update an existing Category")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Category updated successfully"),
            @ApiResponse(code = 404, message = "Category not found"),
            @ApiResponse(code = 400, message = "Invalid Request")
    })
    public Category updateCategory(@PathVariable("id") String id, CategoryRequest category) {
        return Category.builder().build();
    }


}
