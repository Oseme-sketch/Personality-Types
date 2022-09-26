package com.example.personalitytypes.data

import com.example.personalitytypes.model.Category

/**
 * All categories of personality types
 */
object CategoryData {
    fun getCategoryData(): List<Category> {
        return listOf(
            Category(
                name = "Analysts",
                description = listOf("Rational", "Impartial", "Intellectual Excellence"),
            ),
            Category(
                name = "Diplomats",
                description = listOf("Empathetic", "Diplomatic", "Passionate Idealism"),
            ),
            Category(
                name = "Sentinels",
                description = listOf("Practical", "Orderly", "Stable"),
            ),
            Category(
                name = "Explorers",
                description = listOf("Spontaneous", "Ingenious", "Flexible"),
            ),
        )
    }
}
