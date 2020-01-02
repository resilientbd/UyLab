package com.uysys.util.remote.retrofit;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteApiProvider {


   private static final String BASE_URL = "http://128.199.130.94/api/v1/";
 //  private static final String BASE_URL = "http://uysshopapi.herokuapp.com/api/";
   private static final String TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjU2ZWMyZWEyM2ExZmVjYmI0YTU2OGNiMWQzZmNmYWI1MzEyZjMwNTk1NjM1NWEyN2Y2Y2M2NmQwNGNkZDI5NWRmZDc5N2Q3MWM0YzQ4MTY3In0.eyJhdWQiOiIxIiwianRpIjoiNTZlYzJlYTIzYTFmZWNiYjRhNTY4Y2IxZDNmY2ZhYjUzMTJmMzA1OTU2MzU1YTI3ZjZjYzY2ZDA0Y2RkMjk1ZGZkNzk3ZDcxYzRjNDgxNjciLCJpYXQiOjE1NzcxMTE0NjgsIm5iZiI6MTU3NzExMTQ2OCwiZXhwIjoxNjA4NzMzODY4LCJzdWIiOiI1NzkzIiwic2NvcGVzIjpbXX0.ZZdWENMf0KO7R_XvBaJYHVojDUUO_pKpAmpaNUEdx97NcAHJu93S4wpCMklGkyhT-18NMo_BL5J_g8FEiFJjQu6TYtQWs8LBhUv9FhBGGxsye9aKj8AHz_wRMF4ss_au638u_uv3PGUvBPHNMbb6z04m-hRRzuL-54HSBOBMs4UHqvZIjqiM5Xjrg0uI7Z0gnvDiBQcDEMFext05TOlslZfghOqdfIj34jCnPhizSBTTKRYUgpYDK1HAs0FuUrkQPqlMy1VBeyWcQG3kgW-iPSfPuiMrg9klecwU1Oebfu63vTNObx--okFrwxSISZPIgYj5fx7BrKWQIGp5qi8H69gqvorz1qSGWJO2mgRDcJNPMTNbtUZ9CnLRePLF7lfsZBZXV5stoUyZRQfQxdqAK3fyk4-X9Xs77qbrOshgYjE11uoaiMFytT2ONeZY5UbUgPYfTA0l4ajTOdXOPltfQ-vPp884ZO6VNxLFGJeELFZYT1uA7bnMon4DFNvzcZexRbR-DW0J8PvF26IKKOVPmpF6gRH2lDJd5TnhvNSgJST29U5JjoKBWJEdtVREjW1zIZ3MMjQmLBHSgy-hOInRpYm40goJVtV5Grodd5ileT-FEjnYM2s9lZDssk4rDjPRrMR7fPwaHzYSaQyCm4a1XKoaoA6de_BmK5jBr15t6UQ";

    private static RemoteApiProvider mInstance;
    private Retrofit retrofit;
    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request newRequest  = chain.request().newBuilder()
                    .addHeader("Authorization", "Bearer " + TOKEN)
                    .addHeader("Accept","application/json")
                    .build();
            return chain.proceed(newRequest);
        }
    }).build();

    private RemoteApiProvider() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RemoteApiProvider getInstance() {
        if (mInstance == null) {
            mInstance = new RemoteApiProvider();
        }
        return mInstance;
    }


    /**
     * get remote video api for featured and most popular
     * @return retrofit create
     */
    public RemoteApiInterface getRemoteApi(){
        return retrofit.create(RemoteApiInterface.class);
    }




    public static String getBaseUrl() {
        return BASE_URL;
    }
}
