package com.sip.ams.repositories;
import com.sip.ams.entities.*;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article,Long>{
	

}
