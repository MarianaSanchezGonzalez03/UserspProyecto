package com.example.usersp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding= ActivityMainBinding.inflate(layoutInflater)
        userAdapter = UserAdapter(mutableListOf())
        linearLayoutManager= LinearLayoutManager(context: this)
        binding.recyclerView.apply{ this: RecyclerView
            LayoutManager= linearLayoutManager
            adapter= userAdapter

        }
    }

    private fun getUser(): MutableList<Users>{
        val users= mutableListOf<User>()

        val alain= User(id: 1, name:"Alain", lastName:"Nicolas", url: "")
        val samanta= User(id: 2, name:"Samanta", lastName:"Meza", url: "")
     users.add(alain)
        users.add(samanta)
        return  users

    }
}