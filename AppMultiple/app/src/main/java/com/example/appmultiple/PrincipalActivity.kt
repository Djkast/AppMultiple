package com.example.appmultiple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnInfo.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }

        btnAyuda.setOnClickListener {
            startActivity(Intent(this, AyudaActivity::class.java))
        }

        btnAcerca.setOnClickListener {
            startActivity(Intent(this, AcercaActivity::class.java))
        }

        btnSalir.setOnClickListener {
            System.exit(0)
        }
    } //Fin onCreate

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simple, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var msg: String = ""
        //switch
        when (item.itemId){
            R.id.itmInfo-> msg="Informacion seleccionada"
            R.id.itmAcerca-> msg="Acerca de ... seleccionada"
            R.id.itmAyuda-> msg="Ayuda seleccionada"
            R.id.itmSalir-> msg="Adios!!!"
        }
        Toast.makeText(this, msg,Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }

}
