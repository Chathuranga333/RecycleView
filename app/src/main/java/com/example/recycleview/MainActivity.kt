package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class person(val name: String, val age: Int)

class MainActivity : AppCompatActivity() {
    private lateinit var contacts: MutableList<person>
    private lateinit var adapter: ContactAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contacts = createContacts()

        adapter = ContactAdapter(this,contacts)

        val recyclerView: RecyclerView = findViewById(R.id.rvcontacts)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun createContacts(): MutableList<person>{
       val contacts = mutableListOf<person>()
        for (i in 1 .. 20)
        {
            contacts.add(person("person $i",i))
        }
        return contacts
    }
}