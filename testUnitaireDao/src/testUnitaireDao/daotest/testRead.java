package testUnitaireDao.daotest;

import static org.junit.Assert.*;

import org.junit.Test;

import testUnitaireDao.dao.DaoEtudiant;
import testUnitaireDao.metier.Etudiant;

public class testRead {

	@Test
	public void recupererEtudiantTest() {
		DaoEtudiant daoetu = new DaoEtudiant();
		Etudiant etu;
		etu = daoetu.readEtudiantbyId(1);
		assertEquals("message test read", etu.getPrenom(), "cyril");
	}

}
