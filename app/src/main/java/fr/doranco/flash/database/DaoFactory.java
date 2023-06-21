package fr.doranco.flash.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import fr.doranco.flash.dao.SpecialiteDao;
import fr.doranco.flash.entity.Specialite;

/**
 * Classe initialisation de la BD de notre application
 */
@Database(entities = {Specialite.class}, version = 1)
public abstract class DaoFactory extends RoomDatabase {
    private static final String DATABASE_NAME = "GES_CO";
    private static DaoFactory daoFactory;

    /**
     * Getter de l'unique instance de la classe
     *
     * @param context context d'execution de l'application
     * @return instance de DaoFactory.class
     */
    public static DaoFactory getInstance(Context context) {
        if (daoFactory == null) {
            daoFactory = Room
                    .databaseBuilder(context, DaoFactory.class, DATABASE_NAME)
                    .build();
        }
        return daoFactory;
    }

    public abstract SpecialiteDao getSpecialiteDao();
}
