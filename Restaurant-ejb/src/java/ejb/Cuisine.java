package ejb;

import entities.Item;
import entities.OLD_Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class Cuisine 
{
    @PersistenceContext(unitName = "Restaurant-ejbPU")
    private EntityManager em;
    
//    public void ChangerEtat(OLD_Produit produit)
//    {
//        if(produit.getStarted()){
//            produit.setFinished(true);
//        }else{
//            produit.setStarted(true);
//        }  
//    }
    
    public List<Item> getListe() {
        
        String r01 = "select p from Produit p";
        System.out.println("------------------------------------------");
        System.out.println(em.createQuery(r01));
        Query qr = em.createQuery(r01);
        System.out.println("requete " + qr);
        return qr.getResultList();
    }
    
    public void ChangerEtat(String produitRef)
    {
        System.out.println("*******************************************" + produitRef + "****************************");
        Long id = Long.parseLong(produitRef);
        System.out.println("*******************************************" + id + "****************************");
        List<Item> lp = getListe();
        for (Item p:lp ){
            if(p.getId().compareTo(id)==0)
            {
                System.out.println("--------------------***********************--------------------********************---------------------");
                
                if(p.getStarted()){
                    p.setFinished(true);
                }else{
                    p.setStarted(true);
                }
            em.persist(p);
            }
        }
    }
    
//    public void RemiseZero (OLD_Produit produit){
//        
//            produit.setFinished(false);
//            produit.setStarted(false);
//        
//    }
            
    public void RemiseZero(String produitRef){
        Long id = Long.parseLong(produitRef);
        List<Item> lp = getListe();
        for (Item p:lp ){
            if(p.getId().compareTo(id)==0)
            {
                System.out.println("--------------------***********************--------------------********************---------------------");
                
            p.setFinished(false);
            p.setStarted(false);
            em.persist(p);
            }
    }
    }
    public void ChangerDispo(Item item){
        
        if (item.getActive()){
            item.setActive(false);
        }
        else{
        item.setActive(true);}
        
    }
      
    public List<Item> getListei() {
        
     String r01 = "select i from Item i";
        System.out.println("------------------------------------------");
        System.out.println(em.createQuery(r01));
        Query qr = em.createQuery(r01);
        System.out.println("requete " + qr);
        return qr.getResultList();
    }   
    
    public void ChangerDispo(String itemRef){
        System.out.println("*******************************************" + itemRef + "****************************");
        String nomProduit = itemRef;
        System.out.println("*******************************************" + nomProduit + "****************************");
        List<Item> li = getListei();
        for (Item i:li ){
            if(i.getNomItem().equals(nomProduit))
            {
                System.out.println("--------------------***********************--------------------********************---------------------");
                ChangerDispo(i);
            em.persist(i);
            }
        }
    }
    
}