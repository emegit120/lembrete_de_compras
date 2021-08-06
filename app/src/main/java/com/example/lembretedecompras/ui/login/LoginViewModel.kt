package com.example.lembretedecompras.ui.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lembretedecompras.ui.models.RequestState
import com.example.lembretedecompras.ui.models.Usuario
import com.example.lembretedecompras.ui.repository.UsuarioRepository

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val usuarioRepository = UsuarioRepository(application)

    val loginState = MutableLiveData<RequestState<Boolean>>()
    val usuarioLogadoState = MutableLiveData<RequestState<String>>()

    fun logar(usuario: Usuario) {
        loginState.value = usuarioRepository.logar(usuario).value
    }

    fun getUsuarioLogado(){
        usuarioLogadoState.value = usuarioRepository.getUsuarioLogado().value
    }

}
