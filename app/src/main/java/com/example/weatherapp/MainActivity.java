package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //Handler for Retrofit
        Retrofit retrofit = RetrofitClientInstances.getRetrofitInstances();
        DataServices dataServices = retrofit.create(DataServices.class);
        Call<Check> check=dataServices.getCheck("users");

        check.enqueue(new Callback<Check>()
        {
            @Override
            public void onResponse(Call<Check> call, Response<Check> response) {

                if(response.isSuccessful())
                {
                  Toast.makeText(getApplicationContext(),response.body().getEmail(),Toast.LENGTH_SHORT).show();


                }
                else
                {
                    Toast.makeText(MainActivity.this,"Something is Worng",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Check> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Failed is call"+t,Toast.LENGTH_LONG).show();
            }
        });



       /* check.enqueue(new Callback<Check>() {

            @Override
            public void onResponse(Call<Check> call, Response<Check> response) {
                if(response.isSuccessful())
                {
                    Toast.makeText(MainActivity.this,response.body().getEmail(),Toast.LENGTH_SHORT).show();


                }
                else
                {
                    Toast.makeText(MainActivity.this,"Something is Worng",Toast.LENGTH_SHORT).show();


                }

            }

            @Override
            public void onFailure(Call<Check> call, Throwable t) {

            }


        });

*/
    }
}


