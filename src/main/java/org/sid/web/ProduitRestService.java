package org.sid.web;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by celghandour on 14/05/17.
 */

@RestController
public class ProduitRestService {

    @Autowired
    private ProduitRepository produitRepository;
    @RequestMapping(value="/produits",method= RequestMethod.GET)
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }

    @RequestMapping(value="/produits/{id}",method= RequestMethod.GET)
    public Produit getProduit(@PathVariable (name="id") Long id){
        return produitRepository.findOne(id);
    }

    @RequestMapping(value="/produits",method= RequestMethod.POST)
    public Produit saveProduit(@RequestBody Produit P){
        return produitRepository.save(P);
    }
    @RequestMapping(value="/produits/{id}",method= RequestMethod.PUT)
    public Produit update(@RequestBody Produit P,@PathVariable (name="id" )Long id){
        P.setId(id);
        return produitRepository.save(P);
    }

}
