package ru.practicum.sprint8koh9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1 = findViewById<TextView>(R.id.item_1)
        item1.text = "dc kjsdv nksfvn kwsndfv njls dlnwfvjnsjlndv sjid vnls dfbs dgfb sdgb sdfb sdfb sdfb dc kjsdv nksfvn kwsndfv njls dlnwfvjnsjlndv sjid vnls dfbs dgfb sdgb sdfb sdfb sdfb dc kjsdv nksfvn kwsndfv njls dlnwfvjnsjlndv sjid vnls dfbs dgfb sdgb sdfb sdfb sdfb dc kjsdv nksfvn kwsndfv njls dlnwfvjnsjlndv sjid vnls dfbs dgfb sdgb sdfb sdfb sdfb dc kjsdv nksfvn kwsndfv njls dlnwfvjnsjlndv sjid vnls dfbs dgfb sdgb sdfb sdfb sdfb "
//        item1.setOnClickListener(object: View.OnClickListener{
//            override fun onClick(v: View?) {
//               Log.d("SPRINT_8", "item 1 clicked")
//            }
//        })

        item1.setOnClickListener {
            Log.d("SPRINT_8", "item 1 clicked")
        }
    }
}