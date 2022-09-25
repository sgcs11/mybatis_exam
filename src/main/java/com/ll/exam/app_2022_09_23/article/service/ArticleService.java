package com.ll.exam.app_2022_09_23.article.service;

import com.ll.exam.app_2022_09_23.article.dto.Article;
import com.ll.exam.app_2022_09_23.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.getArticles();
    }

    public void write(String subject, String content) {
        articleRepository.write(subject, content);
    }
}
