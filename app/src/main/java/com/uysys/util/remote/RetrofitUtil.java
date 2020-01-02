package com.uysys.util.remote;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitUtil {

   private  RetrofitUtilListener retrofitUtilListener;

    public void setRetrofitUtilListener(RetrofitUtilListener retrofitUtilListener) {
        this.retrofitUtilListener = retrofitUtilListener;
    }
    public  void networkCall(Call call){
            call.enqueue(new Callback() {
                @Override
                public void onResponse(Call call, Response response) {
                    if(retrofitUtilListener!=null){
                        if(response.isSuccessful()){
                       Object object=response.body();
                       retrofitUtilListener.onSuccess(object);
                        }
                    }
                    else{
                        if(retrofitUtilListener!=null){
                            retrofitUtilListener.onError("Error"+response.code());
                        }
                    }
                }

                @Override
                public void onFailure(Call call, Throwable t) {
                    if(retrofitUtilListener!=null)
                    {
                        retrofitUtilListener.onError("Failed"+t.getMessage());
                    }
                }
            });
    }

    public interface RetrofitUtilListener{
      public void onSuccess(Object object);
      public void onError(String message);
  }
    
    

}
