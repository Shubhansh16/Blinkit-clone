package com.example.blinkituser

import android.app.ProgressDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.blinkituser.databinding.ProgressDialogBinding

object Utils {

    private var dialog:AlertDialog?=null

    fun showToast(context: Context, message:String)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showDialog(context: Context,message: String){
        val progress= ProgressDialogBinding.inflate(LayoutInflater.from(context))
        progress.tvMessage.text=message
        dialog=AlertDialog.Builder(context).setView(progress.root).setCancelable(false).create()
        dialog!!.show()
    }
    fun hideDialog(){
        dialog?.dismiss()
    }
}