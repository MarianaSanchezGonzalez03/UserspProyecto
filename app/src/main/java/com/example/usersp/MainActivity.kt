package com.example.usersp

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View.inflate
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText
import java.text.FieldPosition

class MainActivity : AppCompatActivity(), OnClickListener {
private lateinit var userAdapter: UsersAdapter
private lateinit var linearLayoutManager: RecyclerView.LayoutManager

private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater
            setContentView(binding.root)

                val preferences = getPreferences(Context.MODE_PRIVATE)

                val isFirstTime=preferences.getBoolean(getString(R.string.sp_first_time), true)
        Log.i("SP", "${getString(R.string.sp_first_time)}=$isFirstTime")
        Log.i("SP", "${getString(R.string.sp_username)}=${preferences.getBoolean(getString(R.string.sp_username), "NA")}")
        if(isFirstTime) {
            val dialogoView= layoutInflater.inflate(R.layout.dialog_register, null)
            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.dialog_tittle)
                .setView(dialogoView)
                .setCancelable(false)
                .setPositiveButton(R.string.dialog_confirm, {dialogInterface, i
                    val username= dialogoView.findViewById<TextInputEditText>(R.id.etUsername)
                        .text.toString()
                    with(preferences.edit()){
                        putBoolean(getString(R.string.sp_first_time), false)
                        putString(getString(R.string.user_name), username)
                            .apply()
                    }

                    preferences.edit().putBoolean(getString(R.string.sp_first_time), false).commit())}
            .show()


        }
            userAdapter=UserAdapter(getUsers(), this)
            linearLayoutManager= LinearLayoutManager(this)

        binding.recyclerView.apply{
            setHasFixedSize(true)
            layoutManager=linearLayoutManager
            adapter=userAdapter

        }

    }
private fun getUsers():MutableList<User> {
val users=mutableListOf<User>()
    val alain =User(id:1, name:"Alain", lastName:"Nicolas", url: "data:image/jpeg;base64,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" )

    val samanta=User(id:1, name:"Samanta", lastName:"Meza", url: "https://variety.com/wp-content/uploads/2021/11/Samantha-Ruth-Prabhu.jpg" )

    val javier=User(id:1, name:"Javier", lastName:"Gomez", url: "https://yt3.ggpht.com/mv1L_e42mgSiylCxeeRjyY1j1YzDOwZGd_oaT5RvNveEdodlJkTv_eOkao5NCUlUfR_Xoxeh1Dg=s900-c-k-c0x00ffffff-no-rj" )

    val emma =User(id:1, name:"Emma", lastName:"Cruz", url: "data:image/jpeg;base64,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" )
    users.add(alain)
    users.add(samanta)
    users.add(javier)
    users.add(emma)
    users.add(alain)
    users.add(samanta)
    users.add(javier)
    users.add(emma)
    users.add(alain)
    users.add(samanta)
    users.add(javier)
    users.add(emma)
    return users
}

    override fun onClick(user: User, position: Int) {
Toast.makeText(context: this, "$position: ${user.getFullName()}" , Toast.LENGTH_SHORT).show()
    }
}

