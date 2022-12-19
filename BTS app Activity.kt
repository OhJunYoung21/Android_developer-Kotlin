package com.example.myapplication_bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.img_1)
        //변수를 선언해주는 부분입니다.

        image1.setOnClickListener{

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS_1_Activity::class.java)
            //매개변수에 어디로 인동할 것인지를 알려줍니다. BTS_1_Activity 로 이동하기로 하였습니다.
            startActivity(intent)
        }



        val image2 = findViewById<ImageView>(R.id.img_2)
        //변수를 선언해주는 부분입니다.

        image2.setOnClickListener{
            Toast.makeText(this,"2번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MainActivity2::class.java)
            //매개변수에 어디로 인동할 것인지를 알려줍니다. BTS_1_Activity 로 이동하기로 하였습니다.
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.img_3)
        //변수를 선언해주는 부분입니다.

        image3.setOnClickListener{
            Toast.makeText(this,"3번 클릭 완료",Toast.LENGTH_LONG).show()
        }

        val image4 = findViewById<ImageView>(R.id.img_4)
        //변수를 선언해주는 부분입니다.

        image4.setOnClickListener{
            Toast.makeText(this,"4번 클릭 완료",Toast.LENGTH_LONG).show()
        }

        val image5 = findViewById<ImageView>(R.id.img_5)
        //변수를 선언해주는 부분입니다.

        image5.setOnClickListener{
            Toast.makeText(this,"5번 클릭 완료",Toast.LENGTH_LONG).show()
        }

        val image6 = findViewById<ImageView>(R.id.img_6)
        //변수를 선언해주는 부분입니다.

        image6.setOnClickListener{
            Toast.makeText(this,"6번 클릭 완료",Toast.LENGTH_LONG).show()
        }

        val image7 = findViewById<ImageView>(R.id.img_7)
        //변수를 선언해주는 부분입니다.

        image7.setOnClickListener{
            Toast.makeText(this,"7번 클릭 완료",Toast.LENGTH_LONG).show()
        }






    }
}
