package com.example.controltiempos

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ActivityTasks : AppCompatActivity() {
    private lateinit var fab: FloatingActionButton
    private lateinit var fragmentContainer: FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tasks)

        fragmentContainer = findViewById(R.id.fragment_container)
        fab = findViewById(R.id.fab)

        fab.setOnClickListener {
            fragmentContainer.visibility = View.VISIBLE
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentIO())
                .commit()
        }
    }

}