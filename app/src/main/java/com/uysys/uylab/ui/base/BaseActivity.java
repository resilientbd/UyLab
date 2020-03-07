package com.uysys.uylab.ui.base;

import android.app.Application;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;

import com.google.gson.Gson;
import com.uysys.util.AppConstraints;
import com.uysys.util.SharedPrefUtil;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import okhttp3.MediaType;
import okhttp3.RequestBody;


public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {
    private static final String IMAGE_DIRECTORY = "ujwala";

    public abstract int setLayoutId();

    private ViewDataBinding viewDataBinding;

    public abstract void startUI();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, setLayoutId());
        startUI();
    }

    public Context getActivity() {
        return viewDataBinding.getRoot().getContext();
    }

    public void printCommonLog(String arg1, String arg2) {
        Log.d(AppConstraints.LogConstraints.COMMON_TAG, arg1 + ": " + arg2);
    }

    public void printCommonLog(String arg1) {
        Log.d(AppConstraints.LogConstraints.COMMON_TAG, arg1);
    }

    public void printFailedLog(Throwable t)
    {
        Log.d(AppConstraints.LogConstraints.COMMON_TAG, t.getMessage());
    }

    public void printErrorLog(int msg)
    {
        Log.d(AppConstraints.LogConstraints.COMMON_TAG, "Error: "+msg);
    }

    public void printSuccessLog(String msg)
    {
        Log.d(AppConstraints.LogConstraints.COMMON_TAG, "Success: "+msg);
    }
    public ViewDataBinding getViewDataBinding() {
        return viewDataBinding;
    }

    //setting up back functionality with custom view
    public void setBackPressViews(View... Views) {
        for (View v : Views) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
    }

    //setting up back functionality with custom view
    public void setClickListeners(View... Views) {
        for (View v : Views) {
            v.setOnClickListener(this);
        }
    }

    public void showLongToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
    }

    public void showShortToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public void resetViews(View... Views)
    {
        for (View v : Views) {
            boolean b1 = v instanceof TextView ? true : false;
            if (b1 == true) {
                TextView textView = (TextView) v;

                    textView.setText("");



            }
            boolean b2 = v instanceof EditText ? true : false;
            if (b2 == true) {
                EditText editText = (EditText) v;

                    editText.setText("");


            }
            boolean b3 = v instanceof ImageView ? true : false;

            if (b3 == true) {
                ImageView imageView = (ImageView) v;

                   imageView.setVisibility(View.GONE);

            }
        }
    }
    public boolean getValidation(String validationMsg, View... Views) {
        boolean flag = true;
        for (View v : Views) {
            boolean b1 = v instanceof TextView ? true : false;
            if (b1 == true) {
                TextView textView = (TextView) v;
                if (textView.getText().toString().trim().isEmpty()) {
                    textView.setError(validationMsg);
                    flag = false;

                }
            }
            boolean b2 = v instanceof EditText ? true : false;
            if (b2 == true) {
                EditText editText = (EditText) v;
                if (editText.getText().toString().trim().isEmpty()) {
                    editText.setError(validationMsg);
                    flag = false;

                }
            }
            boolean b3 = v instanceof ImageView ? true : false;

            if (b3 == true) {
                ImageView imageView = (ImageView) v;
                if (imageView.getVisibility() == View.GONE || imageView.getVisibility() == imageView.INVISIBLE) {
                    flag = false;
                }
            }
        }
        return flag;
    }



//    public LoginResponse getUser() {
//        Gson gson = new Gson();
//        String userString = SharedPrefUtil.GET_PREFERENCE(getBaseContext(), AppConstraints.SavedCredentials.LOGIN_INFO);
//        if (!userString.isEmpty())
//            return gson.fromJson(userString, LoginResponse.class);
//        else return null;
//    }

//    public int getShopId()
//    {
//        return Integer.parseInt(getUser().getShopInfo().get(0).getRestaurant().getId());
//    }

    public String getCurrentTime() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        return formattedDate;
    }

    @Override
    public void onClick(View v) {

    }

    public File convertBitmapToFile(String filename, ImageView imageView) {
        //create a file to write bitmap data
        File f = new File(getBaseContext().getCacheDir(), filename);
        try {

            f.createNewFile();

//Convert bitmap to byte array
            BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
            Bitmap bitmap = drawable.getBitmap();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 0 /*ignored for PNG*/, bos);
            byte[] bitmapdata = bos.toByteArray();

//write the bytes in file
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                fos.write(bitmapdata);
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            printCommonLog("error convert: " + e.getMessage());
        }
        return f;
    }
//    public void setNavigationButton(View view)
//    {
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(BaseActivity.this, NavigationActivity.class);
//                startActivity(intent);
//            }
//        });
//    }

    public void showdate(final TextView textView) {
        // Get Current Date
        final Calendar c = Calendar.getInstance();

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        String month = "";
                        if (monthOfYear < 10)
                            month = "0" + (monthOfYear + 1);
                        else month = "" + (monthOfYear + 1);
                        String date;

                        if (dayOfMonth < 10) {
                            date = "0" + dayOfMonth;
                        } else {
                            date = "" + dayOfMonth;
                        }
                        String string = date + "/" + (month) + "/" + year;
                        textView.setText(string);

                    }
                }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();

    }
    public String saveImage(Bitmap myBitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        myBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
        File wallpaperDirectory = new File(
                Environment.getExternalStorageDirectory() + IMAGE_DIRECTORY);
        // have the object build the directory structure, if needed.
        if (!wallpaperDirectory.exists()) {
            wallpaperDirectory.mkdirs();
        }

        try {
            File f = new File(wallpaperDirectory, Calendar.getInstance()
                    .getTimeInMillis() + ".jpg");
            f.createNewFile();
            FileOutputStream fo = new FileOutputStream(f);
            fo.write(bytes.toByteArray());
            MediaScannerConnection.scanFile(this,
                    new String[]{f.getPath()},
                    new String[]{"image/jpeg"}, null);
            fo.close();
            Log.d("TAG", "File Saved::---&gt;" + f.getAbsolutePath());

            return f.getAbsolutePath();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return "";
    }


    public RequestBody convertRequestBody(String string)
    {
        return RequestBody.create(MediaType.parse("text/plain"),string);
    }
    public static class Toaster{
        public static void ShowLong(String msg)
        {
            Toast.makeText(getApplicationUsingReflection() ,msg,Toast.LENGTH_LONG).show();
        }
        public  void ShowShort(String msg)
        {
            Toast.makeText(getApplicationUsingReflection() ,msg,Toast.LENGTH_SHORT).show();
        }
        public static Application getApplicationUsingReflection()  {
            try {
                return (Application) Class.forName("android.app.ActivityThread")
                        .getMethod("currentApplication").invoke(null, (Object[]) null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
