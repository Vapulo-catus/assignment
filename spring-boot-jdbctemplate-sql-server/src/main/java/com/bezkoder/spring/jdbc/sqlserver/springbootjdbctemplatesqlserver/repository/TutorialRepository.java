package com.bezkoder.spring.jdbc.sqlserver.springbootjdbctemplatesqlserver.repository;

import com.bezkoder.spring.jdbc.sqlserver.springbootjdbctemplatesqlserver.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public interface TutorialRepository {
    int save(Tutorial book);

    int update(Tutorial book);

    Tutorial findById(Long id);

    int deleteById(Long id);

    List<Tutorial> findAll();

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    int deleteAll();
}
