package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ninja_squad.geektic.service.Geek;

public class Dao {
	
private EntityManager entityManager;

	public List<Geek> getAllUsers()
	{
		String cmd = "Select * from GEEK;";
		TypedQuery<Geek> req = entityManager.createQuery(cmd, Geek.class);
		List<Geek> listUsers = req.getResultList();
		
		return listUsers;
	}
	
	public List<Geek> getSelectedUsers(String champ, String critere)
	{
		String cmd = "Select * from GEEK where " + champ + " like " + critere + ";";
		TypedQuery<Geek> req = entityManager.createQuery(cmd, Geek.class);
		List<Geek> listSelectedUsers = req.getResultList();
		
		return listSelectedUsers;
	}
	
}
