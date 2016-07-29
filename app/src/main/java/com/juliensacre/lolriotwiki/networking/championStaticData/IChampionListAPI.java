package com.juliensacre.lolriotwiki.networking.championStaticData;

import com.juliensacre.lolriotwiki.constant.URILolConst;

import retrofit2.Response;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by JulienSacre on 28/07/2016.
 */
public interface IChampionListAPI {
    @GET(URILolConst.CHAMPION)
    Observable<Response> getChampion();
}
