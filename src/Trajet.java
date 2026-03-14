import java.util.Date;

public class Trajet {
    String nomTrajet;
    String numTrajet;
    Integer durée;
    Date dateDepart;


    public Trajet(String nomTrajet, String numTrajet) {
        this.nomTrajet = nomTrajet;
        this.numTrajet = numTrajet;
        this.dateDepart = new Date();
        this.durée = durée;
    }

    public Trajet() {
    }

    public String getNomTrajet() {
        return nomTrajet;
    }

    public void setNomTrajet(String nomTrajet) {
        this.nomTrajet = nomTrajet;
    }

    public String getNumTrajet() {
        return numTrajet;
    }

    public void setNumTrajet(String numTrajet) {
        this.numTrajet = numTrajet;
    }

    public Integer getDurée() {
        return durée;
    }

    public void setDurée(Integer durée) {
        this.durée = durée;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }
}
