package com.tamdev.waether

import android.app.AlertDialog
import android.content.Context
import android.widget.EditText

object DialogManager {
    fun locationSettingsDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle(R.string.Enable_location)
        dialog.setMessage(context.getString(R.string.locationquestion))
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, (context.getString(R.string.Ok))){ _,_ ->
            listener.onClick(null)
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, (context.getString(R.string.Cancel))){ _,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }


    fun searchByNameDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)
        val dialog = builder.create()
        dialog.setTitle(R.string.City)
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, (context.getString(R.string.Ok))){ _,_ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, (context.getString(R.string.Cancel))){ _,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }



    interface Listener{
        fun onClick(name: String?)
    }
}