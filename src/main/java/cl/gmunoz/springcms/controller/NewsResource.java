package cl.gmunoz.springcms.controller;

import cl.gmunoz.springcms.model.News;
import cl.gmunoz.springcms.model.Review;
import cl.gmunoz.springcms.vo.NewsRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsResource {

    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public News findOne(@PathVariable("id") String id) {
        return News.builder().build();
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public List<News> findAll() {
        return Arrays.asList(News.builder().build(), News.builder().build());
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public News newNews(NewsRequest news) {
        return News.builder().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @ResponseBody
    public void removeNews(@PathVariable("id") String id) {

    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public News updateNews(@PathVariable("id") String id, NewsRequest news) {
        return News.builder().build();
    }

    @GetMapping(value = "/{id}/review/{userId}")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public Review review(@PathVariable("id") String id, @PathVariable("userId") String userId) {
        return Review.builder().build();
    }

    @GetMapping(value = "/revised")
    @ResponseStatus(code = HttpStatus.OK)
    @ResponseBody
    public List<News> revisedNews() {
        return Arrays.asList(News.builder().build(), News.builder().build());
    }
}
