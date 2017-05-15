package org.sid.dao;

import org.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by celghandour on 14/05/17.
 */
public interface ProduitRepository  extends JpaRepository<Produit,Long>{

}
