package com.jorgesys.planetmaster.database;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

public final class Planet implements Parcelable {
    private static final String TAG = Planet.class.getSimpleName();

    //Common name
    public final String name;
    //Description
    public final String description;
    //Classification order
    public final String classification;
    //Path to image resource
    public final String imageAsset;
    //1-10 orbit to the sun
    public final int orbitLevel;

    /**
     * Create a new planet from discrete values
     */
    public Planet(String name, String description, String classification, String imageAsset, int orbitLevel) {
        this.name = name;
        this.description = description;
        this.classification = classification;
        this.imageAsset = imageAsset;
        this.orbitLevel = orbitLevel;
    }

    /**
     * Create a new planet from a database Cursor
     */
    public Planet(Cursor cursor) {
        //TODO: Create a new planet from cursor
        this.name = null;
        this.description = null;
        this.classification = null;
        this.imageAsset = null;
        this.orbitLevel = -1;
    }

    /**
     * Create a new planet from a data Parcel
     */
    protected Planet(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.classification = in.readString();
        this.imageAsset = in.readString();
        this.orbitLevel = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(classification);
        dest.writeString(imageAsset);
        dest.writeInt(orbitLevel);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };
}
