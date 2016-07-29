package com.juliensacre.lolriotwiki.model;

import org.parceler.Parcel;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Created by JulienSacre on 24/07/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
@Parcel
public class ChampionList {
    @NonNull
    private Map<String, Champion> data;
    private String format;
    private Map<String, String> keys;
    @NonNull
    private String type;
    @NonNull
    private String version;

}
