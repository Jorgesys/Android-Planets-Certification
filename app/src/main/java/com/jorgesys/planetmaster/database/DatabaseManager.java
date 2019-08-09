package com.jorgesys.planetmaster.database;

import android.content.Context;
import android.database.Cursor;

/* Singleton that controls access to the SQLiteDatabase instance
 * for this application. */

public class DatabaseManager {
    private static DatabaseManager sInstance;

    public static synchronized DatabaseManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DatabaseManager(context.getApplicationContext());
        }
        return sInstance;
    }

    private PlanetsDbHelper mPlanetsDbHelper;

    private DatabaseManager(Context context) {
        mPlanetsDbHelper = new PlanetsDbHelper(context);
    }

    /**
     * Return a {@link Cursor} that contains every planet in the database.
     *
     * @param sortOrder Optional sort order string for the query, can be null
     * @return {@link Cursor} containing all planet results.
     */
    public Cursor queryAllplanets(String sortOrder) {
        //TODO: Implement the query


        return null;
    }

    /**
     * Return a {@link Cursor} that contains a single planet for the given unique id.
     *
     * @param id Unique identifier for the planet record.
     * @return {@link Cursor} containing the planet result.
     */
    public Cursor queryplanetsById(int id) {
        //TODO: Implement the query
        return null;
    }
}
