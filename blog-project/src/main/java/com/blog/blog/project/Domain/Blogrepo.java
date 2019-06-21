package com.blog.blog.project.Domain;
import org.springframework.data.repository.CrudRepository;

public interface Blogrepo extends CrudRepository<BlogInfo, Long>{//crudrepository--
    // basic crud functionality for doing crud actions, Create Read Update Delete

}
