package testUnitaireDao.daotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import testUnitaireDao.dao.DaoEtudiant;
import testUnitaireDao.metier.Etudiant;

public class testCreate {

	@Test
	public void creerEtudiantTest() {
		DaoEtudiant daoetu = new DaoEtudiant();
		Etudiant etu = new Etudiant(2,"jean","jacques","gege@dh.cof");
		boolean inserted = daoetu.insertEtudiant(etu);
		assertEquals("message test creation",inserted,true);
	}

}
