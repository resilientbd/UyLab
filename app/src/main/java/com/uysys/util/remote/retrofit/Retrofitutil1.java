package com.uysys.util.remote.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Retrofitutil1 {
     private Retrofitutillistener retrofitutillistener;

    public void setRetrofitutillistener(Retrofitutillistener retrofitutillistener) {
        this.retrofitutillistener = retrofitutillistener;
    }

    public void networkCall(Call call){
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                
                if (response.isSuccessful()){
                    if (retrofitutillistener!=null){
                        Object object=response.body();
                        retrofitutillistener.onSuccess(object);
                    }
                    
                }
                else {
                    if (retrofitutillistener!=null){
                        Object object = response.body();
                        retrofitutillistener.onError("error:"+response.code());
                    }
                }

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if (retrofitutillistener!=null){
                    retrofitutillistener.onError("Failed"+t.getMessage());
                    
                }

            }
        });

    }



    public interface Retrofitutillistener{
        public void onSuccess(Object object);
        public void onError(String messege);

    }
}
