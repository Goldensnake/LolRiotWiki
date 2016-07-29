package com.juliensacre.lolriotwiki.model;

import org.parceler.Parcel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Created by JulienSacre on 25/07/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
@Parcel
public class Champion {
    @NonNull
    private int id;
    @NonNull
    private String key;
    @NonNull
    private String name;
    @NonNull
    private String title;
}
