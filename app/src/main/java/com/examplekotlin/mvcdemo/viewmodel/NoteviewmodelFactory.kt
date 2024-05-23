package com.examplekotlin.mvcdemo.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.examplekotlin.mvcdemo.repository.NoteRepository

class NoteviewmodelFactory(val app: Application, private val noteRepository: NoteRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepository) as T
    }

}