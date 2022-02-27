package encinas.maria.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonIniciar: Button = findViewById(R.id.botonP)

        botonIniciar.setOnClickListener(){
            var intent: Intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
        }
    }
}