package entities;


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomItem;
    private String description = "";
    private String imagePath = "";
    private BigDecimal tva;
    private BigDecimal prixHT;
    private Boolean cuisine;
    private Boolean active;
    private Boolean started = false;
    private Boolean finished = false;
    private String commentaire = "";
    private String categorie;

    @ManyToOne
    private Commande commande;
        
    

    public Item()
    {
    }

    public Item(String nomItem, String description, String imagePath,
                BigDecimal TVA, BigDecimal prixHT, Boolean Cuisine, String categorie)
    {
        this.nomItem = nomItem;
        this.description = description;
        this.imagePath = imagePath;
        this.tva = TVA;
        this.prixHT = prixHT;
        this.cuisine = Cuisine;
        this.active = true;
        this.categorie = categorie;
    }

    public Item(String nomItem, String description, String imagePath,
                BigDecimal TVA, BigDecimal prixHT, Boolean Cuisine, String categorie,
                Boolean argStarted, Boolean argFinished, String argCommentaires)
    {
        this.nomItem = nomItem;
        this.description = description;
        this.imagePath = imagePath;
        this.tva = TVA;
        this.prixHT = prixHT;
        this.cuisine = Cuisine;
        this.active = true;
        this.categorie = categorie;
        this.started = argStarted;
        this.finished = argFinished;
        this.commentaire = argCommentaires;
    }


    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (nomItem != null ? nomItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item))
        {
            return false;
        }
        Item other = (Item) object;
        if ((this.nomItem == null && other.nomItem != null) || (this.nomItem != null && !this.nomItem.equals(other.nomItem)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "item =   " + this.nomItem + "\n "
                + "description =   " + this.description + "\n "
                + "chemin vers l'image=   " + this.imagePath + "\n "
                + "TVA=   " + this.tva + "\n "
                + "prix hors taxe=   " + this.prixHT + "\n "
                + "entré en cuisine=   " + this.cuisine + "\n "
                + "present sur la carte=   " + this.active + "\n "
                + "categorie=   " + this.categorie + "\n ";
    }

    
    //<editor-fold defaultstate="collapsed" desc="g/s">

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
    public String getNomItem()
    {
        return nomItem;
    }

    public void setNomItem(String nomItem)
    {
        this.nomItem = nomItem;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }

    public BigDecimal getTva()
    {
        return tva;
    }

    public void setTva(BigDecimal tva)
    {
        this.tva = tva;
    }

    public BigDecimal getPrixHT()
    {
        return prixHT;
    }

    public void setPrixHT(BigDecimal prixHT)
    {
        this.prixHT = prixHT;
    }

    public Boolean getCuisine()
    {
        return cuisine;
    }

    public void setCuisine(Boolean cuisine)
    {
        this.cuisine = cuisine;
    }

    public Boolean getActive()
    {
        return active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    public String getCategorie()
    {
        return categorie;
    }

    public void setCategorie(String categorie)
    {
        this.categorie = categorie;
    }

    public Commande getCommande()
    {
        return commande;
    }

    public void setCommande(Commande commande)
    {
        this.commande = commande;
    }
    
    //</editor-fold>
}
