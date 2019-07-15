package com.example.twitter.repository;


import com.example.twitter.model.Tag;
import com.example.twitter.model.Tweet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TagRepository extends CrudRepository<Tag, Long> {
    Tag findByPhrase (String phrase);
//    List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
}
