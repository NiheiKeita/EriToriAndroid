package com.iggy.eritori

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class GameActivity : AppCompatActivity() {
    val TAG = GameActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        //５）Viewの取得⇒クリア処理
        val myView :MyView =findViewById(R.id.myView)
        val btnClear: Button =findViewById(R.id.btnClear)
        val image = findViewById<ImageView>(R.id.image)

        btnClear.setOnClickListener {
            myView.clearCanvas()
        }
        image.setOnTouchListener { view, motionEvent ->
            when(motionEvent.action){
                MotionEvent.ACTION_DOWN ->{
//                    Log.e(TAG,"www")a
                    true
                }
                MotionEvent.ACTION_UP->{
//                    Log.e(TAG,"www")
                    true
                }
                else ->{
//                    Log.e(TAG,"www")
                    true
                }
            }
        }


    }

//    override fun onTouchEvent(event: MotionEvent): Boolean {
//        val x = event.x
//        val y = event.y
//
//        Log.e(TAG,"www : "+x.toInt())
//        Log.e(TAG,"www : "+(x.toInt()*x.toInt()))
//        when (event.action) {
//            MotionEvent.ACTION_DOWN -> {
//                if((x.toInt()*x.toInt() + y.toInt()*y.toInt()) < 100){
//                    Log.e(TAG,"www : "+x)
//                    Log.e(TAG,"www : "+y)
//                }
//            }
//            MotionEvent.ACTION_MOVE -> {
//                if((x.toInt()*x.toInt() + y.toInt()*y.toInt()) < 100){
//                    Log.e(TAG,"www : "+x)
//                    Log.e(TAG,"www : "+y)
//                }
//            }
//            MotionEvent.ACTION_UP -> {
//                if((x.toInt()*x.toInt() + y.toInt()*y.toInt()) < 100){
//                    Log.e(TAG,"www : "+x)
//                    Log.e(TAG,"www : "+y)
//                }
//            }
//        }
//        return true
//    }
}