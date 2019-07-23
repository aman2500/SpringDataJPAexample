package com.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}