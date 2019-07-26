package com.pchmn.materialchips.model;


import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class Chip implements ChipInterface {


    private String id;
    private String namaKaryawan;

    public Chip( @NonNull String id, @Nullable String namaKaryawan) {

        this.id = id;
        this.namaKaryawan = namaKaryawan;
    }




    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
}
