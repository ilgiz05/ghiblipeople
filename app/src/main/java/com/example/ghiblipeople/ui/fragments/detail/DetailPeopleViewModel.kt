package com.example.ghiblipeople.ui.fragments.detail

import com.example.ghiblipeople.base.BaseViewModel
import com.example.ghiblipeople.data.repositories.PeopleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailPeopleViewModel @Inject constructor(private val repository: PeopleRepository) :
    BaseViewModel() {

    fun fetchPeopleId(id: String) = repository.fetchPeopleId(id)
}