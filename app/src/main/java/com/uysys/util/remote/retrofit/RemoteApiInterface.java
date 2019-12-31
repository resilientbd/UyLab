package com.uysys.util.remote.retrofit;


import com.uysys.util.remote.model.classroutine.ClassRoutine;
import com.uysys.util.remote.model.facility.FacilityModel;
import com.uysys.util.remote.model.galary.GallaryModel;
import com.uysys.util.remote.model.joinrequest.JoinRequest;
import com.uysys.util.remote.model.login.LoginModel;
import com.uysys.util.remote.model.marknotification.MarkModel;
import com.uysys.util.remote.model.notice.NoticeModel;
import com.uysys.util.remote.model.notification.NotificationModel;
import com.uysys.util.remote.model.payment.PaymentModel;
import com.uysys.util.remote.model.profile.ProfileModel;
import com.uysys.util.remote.model.seminar.SeminarModel;
import com.uysys.util.remote.model.seminarjoin.SeminarJoin;
import com.uysys.util.remote.model.tutorial.TutorialModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RemoteApiInterface {
    /**
     * Request to server for registration
     */

    @FormUrlEncoded
    @POST("login")
    Call<LoginModel> login(@Field("email") String email, @Field("password") String password,@Field("push_token") String push_token);

    @FormUrlEncoded
    @POST("join-request")
    Call<JoinRequest> joinrequest(@Field("name") String name, @Field("mobile_number") String mobile_number, @Field("interested_subject") String interested_subject);


    @GET("profile")
    Call<ProfileModel> profile();

    @GET("payment-information")
    Call<PaymentModel> payment();

    @GET("notifications")
    Call<NotificationModel> notification();

    @GET("notifications/mark-as-read")
    Call<MarkModel> marknotification();
    @GET("class-routine")
    Call<ClassRoutine>classroutine();

    @GET("notice")
    Call<NoticeModel>notice();
    @GET("gallery")
    Call<GallaryModel>galary();
    @GET("tutorials")
    Call<TutorialModel>tutorail();
    @GET("facilities")
    Call<FacilityModel>facility();
    @GET("seminars")
    Call<SeminarModel>seminer();

    @FormUrlEncoded
    @POST("seminar/enrolment")
    Call<SeminarJoin> seminarjoin(@Field("participator_name") String participator_name, @Field("seminar_id") String seminar_id, @Field("mobile_number") String mobile_number, @Field("email_address") String email_address) ;

}
