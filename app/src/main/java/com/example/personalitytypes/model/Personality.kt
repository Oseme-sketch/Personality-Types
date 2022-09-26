package com.example.personalitytypes.model

/**
 * Features of personality types
 */
data class Personality(
    val name: String,
    val sociotype: String,
    val description: List<String>,
    val compatibleTypes: List<String>,
    val categoryName: String
)
