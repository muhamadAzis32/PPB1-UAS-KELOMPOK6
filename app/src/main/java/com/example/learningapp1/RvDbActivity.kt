package com.example.learningapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RvDbActivity : AppCompatActivity() {

    private lateinit var rv_tampilanku: RecyclerView
    lateinit var todoDBHelper2: DBHelper2
    private  var list: ArrayList<DBModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_db)

        rv_tampilanku = findViewById(R.id.rv_tampilkan)
        rv_tampilanku.setHasFixedSize(true)
        todoDBHelper2 = DBHelper2(this)
        list.addAll(todoDBHelper2.fullData())
        rv_tampilanku.layoutManager = LinearLayoutManager(this)
        var cardData = DBAdapter(list)
        rv_tampilanku.adapter = cardData

    }
}