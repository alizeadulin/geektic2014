package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.service.Geek;

@Repository
public class Dao {

	@PersistenceContext
	private EntityManager entityManager;

	public Geek getUserByID(int id) {
		return entityManager.find(Geek.class, id);
		}

	public List<Geek> getSelectedUsers(String sexe, String critere) {
		String cmd = "Select u from Geek as u where u.sexe like '" + sexe + "' and u.interets like '%"
				+ critere.toLowerCase() + "%'";
		TypedQuery<Geek> req = entityManager.createQuery(cmd, Geek.class);
		return req.getResultList();
	}

}
