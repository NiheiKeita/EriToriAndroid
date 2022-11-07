package com.iggy.eritori

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_gmae_list.*
import kotlinx.android.synthetic.main.adapter_ghibli.view.*

class GmaeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gmae_list)

        val array = arrayOf("朝","昼","晩","カレー")
        val adapter = GameListAdapter(array,this)
        recycler_game_list!!.layoutManager = LinearLayoutManager(this)
        recycler_game_list!!.setAdapter(adapter)

    }
    inner class GameListAdapter(
//        var GhibliDate: List<GhibliListModel>,
        var GhibliDate: Array<String>,
        var context: Context?,
    ): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

        inner class GhibliViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            fun onBind(position: Int){
                val item = GhibliDate[position]
                itemView.game_title.text=item

                itemView.setOnClickListener {
                    startActivity(Intent(this@GmaeListActivity, GameActivity::class.java))
                    overridePendingTransition(0, 0)
                }
            }
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val v: View = LayoutInflater.from(context).inflate(R.layout.adapter_ghibli, parent, false)
            return GhibliViewHolder(v)
        }
        override fun getItemCount(): Int = GhibliDate.size

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as GhibliViewHolder).onBind(position)
        }
    }
}