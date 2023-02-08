package be.ephec.java.exercice.e05;

public class Sale
{
    Double reduction;
    Double prix;

    Car Voiture = new Car("Opel", "Tigra", "VF343435555RR");

    public Sale(double reduction, Double prix)
    {
        this.reduction = reduction;
        this.prix = prix;
    }

    public Double computeRealPrice(Double reduction)
    {
        Double prixReel = prix - reduction;

        return prixReel;
    }

    public void Display()
    {
        System.out.println(" Marque : " + Voiture.marque + " - Modèle : " + Voiture.modele +
                " - Numero de serie : " + Voiture.numeroDeSerie);
        System.out.println(" Prix = " + computeRealPrice(34.8));
    }
}
