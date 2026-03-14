import java.time.LocalDateTime;



public class Trajet {
   private Integer idTrajet;
   private String villeDepart;
   private String villeArrivee;
   private String paysDepart;
   private String paysArrivee;
   private LocalDateTime dateHeureDepart;
   private LocalDateTime dateHeureArrivee;
   private Integer duree;
   private Enum typeTransport;
   private String numVol_bus;
   private String nomCompagnie;
   private Integer ordreTrajet;
   private Enum statut;
   private String description;
   private LocalDateTime dateCreation;
   private LocalDateTime dateModification;


    public Trajet(Integer idTrajet, String villeDepart, String villeArrivee, String paysDepart, String paysArrivee, LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, Integer duree, Enum typeTransport, String numVol_bus, String nomCompagnie, Integer ordreTrajet, Enum statut, String description, LocalDateTime dateCreation, LocalDateTime dateModification) {
        this.idTrajet = idTrajet;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.paysDepart = paysDepart;
        this.paysArrivee = paysArrivee;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.duree = duree;
        this.typeTransport = typeTransport;
        this.numVol_bus = numVol_bus;
        this.nomCompagnie = nomCompagnie;
        this.ordreTrajet = ordreTrajet;
        this.statut = statut;
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public Trajet() {
    }

    public Integer getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(Integer idTrajet) {
        this.idTrajet = idTrajet;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getPaysDepart() {
        return paysDepart;
    }

    public void setPaysDepart(String paysDepart) {
        this.paysDepart = paysDepart;
    }

    public String getPaysArrivee() {
        return paysArrivee;
    }

    public void setPaysArrivee(String paysArrivee) {
        this.paysArrivee = paysArrivee;
    }

    public LocalDateTime getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(LocalDateTime dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public LocalDateTime getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(LocalDateTime dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Enum getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(Enum typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getNumVol_bus() {
        return numVol_bus;
    }

    public void setNumVol_bus(String numVol_bus) {
        this.numVol_bus = numVol_bus;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }

    public void setNomCompagnie(String nomCompagnie) {
        this.nomCompagnie = nomCompagnie;
    }

    public Integer getOrdreTrajet() {
        return ordreTrajet;
    }

    public void setOrdreTrajet(Integer ordreTrajet) {
        this.ordreTrajet = ordreTrajet;
    }

    public Enum getStatut() {
        return statut;
    }

    public void setStatut(Enum statut) {
        this.statut = statut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateModification() {
        return dateModification;
    }

    public void setDateModification(LocalDateTime dateModification) {
        this.dateModification = dateModification;
    }
}
