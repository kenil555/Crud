package com.examplekotlin.mvcdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.examplekotlin.mvcdemo.database.NoteDatabase
import com.examplekotlin.mvcdemo.repository.NoteRepository
import com.examplekotlin.mvcdemo.viewmodel.NoteViewModel
import com.examplekotlin.mvcdemo.viewmodel.NoteviewmodelFactory
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
    }

    private fun setupViewModel() {
        val noteRepository = NoteRepository(NoteDatabase(this))
        val viewModelProviderFactory = NoteviewmodelFactory(application, noteRepository)
        noteViewModel = ViewModelProvider(this, viewModelProviderFactory)[NoteViewModel::class.java]
    }



}
