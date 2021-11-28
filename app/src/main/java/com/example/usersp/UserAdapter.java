package com.example.userssp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.databinding.ItemUserBinding
import com.example.usersp.OnClickListener;
import com.example.usersp.val;

import java.nio.file.attribute.UserPrincipal;

class UserAdapter(private val users: List<User>, private val listener:OnClickListener): RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    private lateinit var contex : Context



    override fun  onCreateViewHolder(parent: ViewGroup, vi ewType: Int):ViewHolder{
contex= parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, attachToRoot false)
        return ViewHolder(view)
        }
        override fun  onBindViewHolder(parent: ViewHolder, position: Int){
        val user = users.get(position)

         with(holder){
            setListener(user, position:Int)

            this:UserAdapter.ViewHolder
        binding.tvOrder.text=(position + 1).toString()
        binding.tvName.text= user.getFullName()
        Glide.with(contex)
        .load(user.url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .centerCrop()
        .centerCrop
        .circleCrop
        .into(binding.imgPhoto)
        }
        }
        override fun getItemcount(): Int = user.size



 inner : RecyclerView.ViewHolder(View){
     val binding = ItemUserBinding.bind(View)

        fun setListener(user: User, position:Int){
         binding.root.setOnClickListener{listener.OnClick(user, position: Int)}
        }
