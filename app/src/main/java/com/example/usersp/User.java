package com.cursosant.android.userssp

/****
 * Project: Fundamentos Kotlin
 * From: com.cursosant.android.fundamentoskotlin.classes
 * Created by Mariana Sanchez on 10/11/20 at 13:17
 * Course: Android Practical whit Kotlin from zero.
 * All rights reserved 2021
 *
 * All my Courses(Only  on Udemy ):
 * https://www.udemy.com/user/alain-nicolas-tello/
 ****/
data class  User  (
        id:int, var name:String, var lastName: String,  var url:String){
fun     getFulName(): String= "$name $las"
}
