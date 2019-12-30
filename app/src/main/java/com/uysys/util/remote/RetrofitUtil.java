package com.uysys.util.remote;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitUtil {
private RetrofitUtilListener retrofitUtilListener;

    public void setRetrofitUtilListener(RetrofitUtilListener retrofitUtilListener) {
        this.retrofitUtilListener = retrofitUtilListener;
    }

    public void networkCall(Call call){
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
               if(response.isSuccessful())
               {
                   if(retrofitUtilListener!=null)
                   {
                       Object object=response.body();
                      // Log.d("chk","model:"+object.toString());
                       retrofitUtilListener.onSucces(object);
                   }

               }
               else {
                   if(retrofitUtilListener!=null)
                   {
                       Object object=response.body();
                       // Log.d("chk","model:"+object.toString());
                       retrofitUtilListener.onError("error:"+response.code());
                   }
                   //Log.d("chk","model:"+response.code());
               }

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(retrofitUtilListener!=null)
                {

                    retrofitUtilListener.onError("failed:"+t.getMessage());
                }
                //Log.d("chk","failed:"+t.getMessage());
            }
        });
    }

    public interface RetrofitUtilListener{
        public void onSucces(Object object);
        public void onError(String message);
    }
}
