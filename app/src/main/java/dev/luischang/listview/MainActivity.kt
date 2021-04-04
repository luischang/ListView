package dev.luischang.listview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //Se crea una arreglo de string con los valores que se asginarán a la lista
    var arrSO = arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Se obtiene el view lstSO
        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.lsvSO) as ListView
        //Se crea un adaptador para llenar la lista
        val adaptador: Any? =
                ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1, arrSO)
        //Se asigna el adaptador a la view
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?
        //Se genera el método setOnItemClickListener de la view

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                    applicationContext,
                    "Posición: $position",
                    Toast.LENGTH_SHORT
            ).show()

        }


    }
}