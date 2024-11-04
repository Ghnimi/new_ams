package com.sip.ams.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.sip.ams.entities.Article;
import com.sip.ams.entities.Provider;

public interface ProviderService {
	
	public List<Provider> listProviders();
	
	public Provider saveProvider(Provider provider);
	
	public boolean deleteProvider(long id);
	
	public Provider getProviderById(long id);
	
	//@Query("FROM Article a WHERE a.provider.id = ?1")
	//public List<Article> findProviderArticles(long id);

}
