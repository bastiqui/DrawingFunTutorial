package com.example.bastiqui.drawingfun;

import android.util.SparseIntArray;

public class Imagenes {
    private SparseIntArray wallpaper = new SparseIntArray();

    Imagenes () {
        wallpaper.put(1, R.drawable.owl);
        wallpaper.put(2, R.drawable.gato);
        wallpaper.put(3, R.drawable.mono);
        wallpaper.put(4, R.drawable.oso);
    }

    public SparseIntArray getWallpaper() {
        return wallpaper;
    }
}
