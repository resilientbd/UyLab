package com.uysys.util;

public class AppConstraints {
   public interface LogConstraints{
       public static String COMMON_TAG="chk";
   }
   public interface NotificationTopics{
       public static final String TOPIC_GLOBAL = "global";
   }
   public interface IntentDataConstraints{
       public static String BLOG_DATA="blogdata";
       public static String JOB_DATA="jobdata";
       public static String SALOON_DATA="saloondata";
       public static String UAJALA_DATA="ujaladata";
   }
   public interface ModelJobDataConstraints{
       public static String JOB_TYPE_KEY="job_type";
       public static String JOB_TYPE_VALUE1="full time";
       public static String JOB_TYPE_VALUE2="part time";
   }
   public interface AppBaseUrl{
       public static String APP_URL="https://ujjwala.herokuapp.com/api/";
       public static String IMAGE_PATH="https://ujjwala.herokuapp.com";
   }
   public interface NewAppBaseUrl{
       public static String IMAGE_PATH="http://ujala.boihub.com/ujala/mobileapp_api/";
   }

   public interface IntentConstrants{
       public static String GET_RESTUARANT="restuarant";
       public static String GET_MENUS="menus";
       String SALOON_NAME = "saloon_name";
       String CART_MAP = "cart_map";
       String SALOON_ID ="shop_id" ;

       //BOOKING DETAILS
       String CART_OBJ = "cart_obj";
       String SLOT = "slot";
       String Data = "data";
   }

   public interface UserInfo{
       public static String USERID="userid";
       public static String USER_NAME="username";
       public static String FIREBASE_TOKE="firebasetoken";
   }
   public interface FirebaseField{
       public static String CART="tbl_cart";
       public static String ITEM_ID="item_id";
       public static String ITEM_PRICE="item_price";
       public static String ITEM_IMG="item_img";
       public static String ITEM_MENU_NAME="item_name";
   }
   public interface SavedCredentials{
       public static String LOGIN_INFO="logininfo";
       public static String TOKEN="token";
   }

   public interface TimeFormats{
       public static String FORMAT_INPUT="YYYY-MM-DD HH:mm:ss";
       public static String FORMAT_OUTPUT_1="hh aa, dd MMM";
   }
   public interface AppCredential{
       public static String API_TOKEN="api_token";
       public static String FIREBASE_TOKEN="firebase_token";
   }
}
