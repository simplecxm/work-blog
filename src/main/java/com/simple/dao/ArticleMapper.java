package com.simple.dao;

import com.simple.pojo.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> getAllArticleList();

    List<Article> searchByTags(String tags);

    List<Article> searchByKeyWord(String keyWord);

    int updateUserUpdateArticleTime(Integer id);

    int iLikeIt(Integer articleId);

    int idontLikeIt(Integer articleId);
}