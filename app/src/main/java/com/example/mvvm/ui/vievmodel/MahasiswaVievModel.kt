package com.example.mvvm.ui.vievmodel

import android.provider.ContactsContract.Data
import androidx.lifecycle.ViewModel
import com.example.mvvm.Model.DataMahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //Request
    private val _uiState = MutableStateFlow(DataMahasiswa())
    val uiState: StateFlow<DataMahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa(listDM: List<String>){
        _uiState.update { dataMhs ->
            dataMhs.copy(
                nama = listDM[0],
                nim = listDM[1],
                gender = listDM[2],
                email = listDM[3],
                alamat = listDM[4],
                nohp = listDM[5],
            )
        }
    }
}