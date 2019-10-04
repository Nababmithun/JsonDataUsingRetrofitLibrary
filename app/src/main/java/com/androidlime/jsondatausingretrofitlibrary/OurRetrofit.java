package com.androidlime.jsondatausingretrofitlibrary;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Mithun on 10/4/2019.
 */

public interface OurRetrofit {


    @GET("17z5vj")
    Call<List<OurDataSet>> getDataset();

}
