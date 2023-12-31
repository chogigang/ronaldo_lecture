package com.cho.ronaldolecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1. 화면이 클릭되었다 것을 알려 한다.(프로그램이)
        val ronaldo_cute = findViewById<ImageView>(R.id.ronaldo_cute_image);  //변수 선언
        val ronaldo_ = findViewById<ImageView>(R.id.ronaldo_image);
        val ronaldo_jube = findViewById<ImageView>(R.id.ronaldo_jude_image);
        val ronaldo_real = findViewById<ImageView>(R.id.ronaldo_real_image);
        val ronaldo_water = findViewById<ImageView>(R.id.ronaldo_water_image);
        val ronaldo_saudi = findViewById<ImageView>(R.id.ronaldo_saudi_image);
        ronaldo_cute.setOnClickListener {
            Toast.makeText(this, "사랑스러운 신두형", Toast.LENGTH_LONG)
                .show(); //사진을 클릭했을때 Tost메시지를 띄우는 명령어

            //2.화면이 클릭되면 다음화면으로  넘어가서 사진을 크게 보여줌
            // 하나의 엑티비티로 넘기기때문에 기존 하드코딩 자리는 주석
//            val intent = Intent(this, Ronaldo_cute_Activity::class.java)
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","cute") //화면상의 intent 데이터를 넘길때 사용 아름,키값
            startActivity(intent)

        }
        ronaldo_.setOnClickListener {
            Toast.makeText(this, "자랑스러운 날두형 ", Toast.LENGTH_LONG).show();
            val intent = Intent(this, ImageInsideActivity::class.java)
//            val intent = Intent(this, RonaldoActivity::class.java);
            intent.putExtra("data","br")
            startActivity(intent);

        }
        ronaldo_jube.setOnClickListener {
            Toast.makeText(this, "siuuu ", Toast.LENGTH_LONG).show();
            val intent = Intent(this, ImageInsideActivity::class.java)
//            val intent = Intent(this, Ronaldo_jubeActivity::class.java);
            intent.putExtra("data","jube")
            startActivity(intent);


        }
        ronaldo_real.setOnClickListener {
            Toast.makeText(this, "진짜 신두형 ", Toast.LENGTH_LONG).show();
//            val intent = Intent(this, Ronaldo_realActivity::class.java);
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","real")
            startActivity(intent);
        }
        ronaldo_water.setOnClickListener {
            Toast.makeText(this, "꼬북두", Toast.LENGTH_LONG).show();
//            val intent = Intent(this, Ronaldo_waterActivity::class.java);
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","water")
            startActivity(intent);
        }
        ronaldo_saudi.setOnClickListener {
            Toast.makeText(this, " 기름두 ", Toast.LENGTH_LONG).show();
//            val intent = Intent(this, Ronaldo_saudiActivity::class.java);
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","saudi")
            startActivity(intent);
        }

    }
}
