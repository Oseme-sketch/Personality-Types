package com.example.personalitytypes.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.personalitytypes.data.CategoryData
import com.example.personalitytypes.data.PersonalityData

class PersonalityViewModel: ViewModel() {
    private var _currentCategory = MutableLiveData<Category>()
    val currentCategory: LiveData<Category> get() = _currentCategory

    private var _categoryData = listOf<Category>()
    val categoryData: List<Category> get() = _categoryData

    private var _currentPersonalities = MutableLiveData<List<Personality>>()
    val currentPersonalities: LiveData<List<Personality>> get() = _currentPersonalities

    private var _personalityData = listOf<Personality>()
    val personalityData: List<Personality> get() = _personalityData

    init {
        // Initialize the Category data
        _categoryData = CategoryData.getCategoryData()
        _currentCategory.value = _categoryData[0]

        // Initialize the Personality data
        _personalityData = PersonalityData.getPersonalityData()
        _currentPersonalities.value = _personalityData.filter {
            it.categoryName == "Analysts"
        }
    }

    fun updateCurrentCategory(category: Category) {
        _currentCategory.value = category
        _currentPersonalities.value = _personalityData.filter {
            it.categoryName == category.name
        }
    }
}
