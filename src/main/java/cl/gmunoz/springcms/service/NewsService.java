package cl.gmunoz.springcms.service;

import cl.gmunoz.springcms.model.News;
import cl.gmunoz.springcms.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;


    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public News update(News news) {
        return this.newsRepository.save(news);
    }

    public News create(News news) {
        return this.newsRepository.save(news);
    }

    public void delete(String id) {
        final News news = this.newsRepository.findOne(id);
        this.newsRepository.delete(news);
    }

    public List<News> findAll() {
        return this.newsRepository.findAll();
    }

    public News findOne(String id) {
        return this.newsRepository.findOne(id);
    }
}
