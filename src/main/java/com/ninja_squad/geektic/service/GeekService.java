package com.ninja_squad.geektic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@Transactional
@RequestMapping("/geek")
public class GeekService {
	
	@Autowired
	private Dao getAccess;
	
    
    @RequestMapping(method = RequestMethod.GET, value = "/{sexe}/{interets}")
    public List<Geek> getListSelectedGeek(@PathVariable ("sexe") String sexe, @PathVariable ("interets") String interets) {
    	
        return getAccess.getSelectedUsers(sexe, interets);
    }
}
