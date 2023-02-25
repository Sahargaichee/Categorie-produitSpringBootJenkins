package backend.backend.service;

import backend.backend.Entity.Categorie;

import java.util.List;

public interface Categorieservice {
    public  Categorie addcategorie(Categorie categorie);

    public List<Categorie> getcategories();

    public Categorie getcategorieByid(long id);

    public Categorie updatecategorie (long id , Categorie categorie);

    public void deletecategorie(Long id);
}
