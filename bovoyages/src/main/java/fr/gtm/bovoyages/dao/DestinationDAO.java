package fr.gtm.bovoyages.dao;

//import java.util.List;
//import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import fr.gtm.bovoyages.entities.*;


public class DestinationDAO extends AbstractDAO<Destination, Long> {

public DestinationDAO(EntityManagerFactory emf) {
		super(emf, Destination.class);
	}
	
//	public List<Commune> getCommunesByCodePostal(String codePostal){
//		return getCommunes("Commune.byCodePostal", "codePostal",codePostal+"%".toUpperCase());
//	}
//	
//	public List<Commune> getCommunesByDepartement(String departement){
//		return getCommunes("Commune.byDepartement", "nom", departement.toUpperCase());
//	}
//	
//	public List<Commune> getCommunesByNom(String nom){
//		return getCommunes("Commune.byNom", "nom", nom.toUpperCase()+"%");
//	}
//	
//	public List<Commune> getCommunesByRegion(String region){
//		return getCommunes("Commune.byRegion","nom", region.toUpperCase());
//	}
//	
//	public List<String> getAllRegions(){
//		EntityManager em = getEntityManagerFactory().createEntityManager();
//		List<String> regions = em.createNamedQuery("Region.all",String.class).getResultList();
//		em.close();
//		return regions;
//	}
//	
//	public List<Departement> getAllDepartement(){
//		EntityManager em = getEntityManagerFactory().createEntityManager();
//		List<Departement> departements = em.createNamedQuery("Departement.all",Departement.class).getResultList();
//		em.close();
//		return departements;
//	}
//	
//	private List<Commune> getCommunes(String namedQuery,String paramName, String paramValue){
//		EntityManager em = getEntityManagerFactory().createEntityManager();
//		List<Commune> communes = em.createNamedQuery(namedQuery,Commune.class)
//									.setParameter(paramName, paramValue)
//									.getResultList();
//		em.close();
//		return communes;
//	}
	
}
