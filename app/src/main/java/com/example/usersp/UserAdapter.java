package com.example.userssp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.databinding.ItemUserBinding

import java.nio.file.attribute.UserPrincipal;


/****
 * Project: User SP
 * From: com.cursors.android.userssp
 * Created by Mariana Sanchez on 10/11/20 at 13:17
 * Course: Android Practical whit Kotlin from zero.
 * All rights reserved 2021
 *
 * All my Courses(Only  on Udemy ):
 * https://www.udemy.com/user/alain-nicolas-tello/
 ****/
class UserAdapter(private val users:List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){
private lateinit var contex : Context
    override fun  onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder{
contex= parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, attachToRoot false)
        return ViewHolder(view)
        }
        override fun  onBindViewHolder(parent: ViewHolder, position: Int){
        val user = users.get(position)

         with(holder){
            this:UserAdapter.ViewHolder
        binding.tvOrder.tex=user.id.toString()
        binding.tvName.text= user.name
        }
        }
        override fun getItemcount(): Int = user.size

 inner class ViewHolder(view: View): RecyclerView.ViewHolder(View){
     val binding = ItemUserBinding.bind(View)
    }
}
