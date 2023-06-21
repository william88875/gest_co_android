package fr.doranco.flash.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import fr.doranco.flash.entity.Specialite;

@Dao
public interface SpecialiteDao {
    /**
     * enregistrer une nouvelle specialite en bd
     *
     * @param specialite le nouvel objet a enregistrer
     */
    @Insert
    void create(Specialite specialite);

    /**
     * Rechercher une specialite grace a son id
     *
     * @param id de la specialite
     * @return une specialite
     */
    @Query("SELECT * FROM specialites WHERE id = :id")
    Specialite findById(int id);

    /**
     * Lister toutes les specialites
     *
     * @return la liste des specialites
     */
    @Query("SELECT * FROM specialites")
    List<Specialite> findAll();

    /**
     * Update une ancienne specialite
     *
     * @param specialite a mettre a jour
     */
    @Update
    void update(Specialite specialite);

    /**
     * Supprimer une specialite
     *
     * @param specialite a delete
     */
    @Delete
    void delete(Specialite specialite);

}
