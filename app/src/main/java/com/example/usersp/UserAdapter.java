package com.example.userssp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.databinding.ItemUserBinding

import java.nio.file.attribute.UserPrincipal;


/****
 * Project: Fundaments Kotlin
 * From: com.cursors.android.fundamentalist.classes
 * Created by Mariana Sanchez on 10/11/20 at 13:17
 * Course: Android Practical whit Kotlin from zero.
 * All rights reserved 2021
 *
 * All my Courses(Only  on Udemy ):
 * https://www.udemy.com/user/alain-nicolas-tello/
 ****/
class UserAdapter(UserAd val users:List<User>) : RecyclerView.Adapter<ViewHolder>(){

    override fun  onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder{
        TODO(reason: "Not yet implemented")
        }
        override fun  onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder{
        TODO(reason: "Not yet implemented")
        }
        override fun  onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder{
        TODO(reason: "Not yet implemented")
        }

 inner class ViewHolder(view: View): RecyclerView.ViewHolder(View){
     val binding = ItemUserBinding.bind(View)
    }
}
