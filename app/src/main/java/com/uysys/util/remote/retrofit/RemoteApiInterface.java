package com.uysys.util.remote.retrofit;


import com.uysys.util.remote.model.Seminar_Enrollment.SeminarEnrollment;
import com.uysys.util.remote.model.batch_enrollment.BatchEnrollment;
import com.uysys.util.remote.model.branches_list.BranchesList;
import com.uysys.util.remote.model.classRoutine.ClassRoutine;
import com.uysys.util.remote.model.contact_us.ContactUs;
import com.uysys.util.remote.model.course_details.CourseDetails;
import com.uysys.util.remote.model.course_enrollment.CourseEnrollment;
import com.uysys.util.remote.model.eventDetails.EventDetails;
import com.uysys.util.remote.model.event_enrollment.EventEnrollment;
import com.uysys.util.remote.model.facility.FacilityList;
import com.uysys.util.remote.model.gallery.Gallery;
import com.uysys.util.remote.model.joinRequest.JoinRequest;
import com.uysys.util.remote.model.list_offer.ListOffer;
import com.uysys.util.remote.model.login.Login;
import com.uysys.util.remote.model.mentor_profile.MentorProfile;
import com.uysys.util.remote.model.notice.Notice;
import com.uysys.util.remote.model.notification_read.Notifications_Read;
import com.uysys.util.remote.model.notifications.Notifications;
import com.uysys.util.remote.model.offer_enrollment.OfferEnrollment;
import com.uysys.util.remote.model.partners_concern.PartnersConcern;
import com.uysys.util.remote.model.paymentSummary.PaymentSummary;
import com.uysys.util.remote.model.profile_information.ProfileInformation;
import com.uysys.util.remote.model.seminar.SeminarList;
import com.uysys.util.remote.model.tutorial.Tutorial;
import com.uysys.util.remote.model.upcoming_batches.UpcomingBatches;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RemoteApiInterface {
    /**
     * Request to server for registration
     * */

    @FormUrlEncoded
    @POST("login")
    Call<Login> login(@Field("email") String email, @Field("password") String password,@Field("push_token") String push_token);

    @FormUrlEncoded
    @POST("join-request")
    Call<JoinRequest> joinReq(@Field("name") String name, @Field("mobile_number") String mobile_number, @Field("interested_subject") String interested_subject);

    @GET("profile")
    Call<ProfileInformation> proInfo();

    @GET("payment-information")
    Call<PaymentSummary> paymentSum();

    @GET("notifications")
    Call<Notifications> notific();

    @GET("notifications/mark-as-read")
    Call<Notifications_Read> noti_read();

    @GET("class-routine")
    Call<ClassRoutine> cls_routine();

    @GET("notice")
    Call<Notice> notice();

    @GET("gallery")
    Call<Gallery> gallery();

    @GET("tutorials")
    Call<Tutorial> tutorial();

    @GET("facilities")
    Call<FacilityList> facility();

    @GET("seminars")
    Call<SeminarList> seminarList();

    @FormUrlEncoded
    @POST("seminar/enrolment")
    Call<SeminarEnrollment> semEnroll(@Field("participator_name") String participator_name, @Field("seminar_id") String seminar_id, @Field("mobile_number") String mobile_number, @Field("email_address") String email_address);

    @GET("events")
    Call<EventDetails> eventDetails();

    @FormUrlEncoded
    @POST("event/enrolment")
    Call<EventEnrollment> eventEnroll(@Field("participator_name") String participator_name, @Field("event_id") String event_id, @Field("mobile_number") String mobile_number, @Field("email_address") String email_address);

    @GET("courses")
    Call<CourseDetails> courseDetails();

    @FormUrlEncoded
    @POST("course/enrolment")
    Call<CourseEnrollment> course_enroll(@Field("participator_name") String participator_name, @Field("course_id") String course_id, @Field("mobile_number") String mobile_number, @Field("email_address") String email_address);

    @GET("partners")
    Call<PartnersConcern> partnerConcern();

    @GET("offers")
    Call<ListOffer> list_offer();

    @FormUrlEncoded
    @POST("offer/enrolment")
    Call<OfferEnrollment> offer_enroll(@Field("participator_name") String participator_name, @Field("offer_id") String offer_id, @Field("mobile_number") String mobile_number, @Field("email_address") String email_address);

    @GET("batches/upcoming")
    Call<UpcomingBatches> upcoming_batches();

    @FormUrlEncoded
    @POST("batch/enrolment")
    Call<BatchEnrollment> batch_enroll(@Field("participator_name") String participator_name, @Field("batch_id") String batch_id, @Field("mobile_number") String mobile_number, @Field("email_address") String email_address);

    @GET("mentors")
    Call<MentorProfile> mentor_profile();

    @GET("branches")
    Call<BranchesList> branches_List();

    @FormUrlEncoded
    @POST("contact-us")
    Call<ContactUs> contactUs(@Field("name") String name, @Field("mobile_number") String mobile_number, @Field("message") String message);

    @FormUrlEncoded
    @POST("login")
    Call<Login> loginui(@Field("email") String email, @Field("password") String password);
}
