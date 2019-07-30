package com.example.materialdesignsample.ui.base

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatDrawableManager
import com.example.materialdesignsample.R
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

abstract class BaseActivity : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        configureBottomAppBar()
    }

    abstract fun getMenu(): Int

    abstract fun getFabIcon(): Int

    @SuppressLint("RestrictedApi")
    private fun configureBottomAppBar(){
        val bottomBar = findViewById<BottomAppBar>(R.id.bar)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        bottomBar.replaceMenu(getMenu())
        fab.setImageDrawable(AppCompatDrawableManager.get().getDrawable(this, getFabIcon()))
    }
}
