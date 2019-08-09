package com.jorgesys.planetmaster.database;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * RecyclerView adapter extended with project-specific required methods.
 */

public class PlanetRecyclerAdapter extends
        RecyclerView.Adapter<PlanetRecyclerAdapter.planetHolder> {

    /* ViewHolder for each planet item */
    public class planetHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public planetHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {
        }
    }

    private Cursor mCursor;

    @Override
    public planetHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(planetHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    /**
     * Return the {@link planet} represented by this item in the adapter.
     *
     * @param position Adapter item position.
     *
     * @return A new {@link planet} filled with this position's attributes
     *
     * @throws IllegalArgumentException if position is out of the adapter's bounds.
     */
    public Planet getItem(int position) {
        if (position < 0 || position >= getItemCount()) {
            throw new IllegalArgumentException("Item position is out of adapter's range");
        } else if (mCursor.moveToPosition(position)) {
            return new Planet(mCursor);
        }
        return null;
    }
}
