package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

class ECToast {
    companion object{
        fun show(context: Context, message: String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}