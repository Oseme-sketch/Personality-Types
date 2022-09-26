package com.example.personalitytypes.data

import com.example.personalitytypes.constants.Sociotype
import com.example.personalitytypes.model.Personality

/**
 * All personality types
 */
object PersonalityData {
    fun getPersonalityData(): List<Personality> {
        return listOf(
            Personality(
                name = "Mastermind",
                sociotype = Sociotype.INTJ,
                description = listOf("Strategic Personality", "Analytical Thinker"),
                compatibleTypes = listOf(Sociotype.ENTP, Sociotype.ENFP),
                categoryName = "Analysts"
            ),
            Personality(
                name = "Logician",
                sociotype = Sociotype.INTP,
                description = listOf("Creative Personality", "Flexible Thinker"),
                compatibleTypes = listOf(Sociotype.ENTJ, Sociotype.ENFJ),
                categoryName = "Analysts"
            ),
            Personality(
                name = "Commander",
                sociotype = Sociotype.ENTJ,
                description = listOf("Decisive Personality", "Analytical Thinker"),
                compatibleTypes = listOf(Sociotype.INTP, Sociotype.INFP),
                categoryName = "Analysts"
            ),
            Personality(
                name = "Visionary",
                sociotype = Sociotype.ENTP,
                description = listOf("Creative Personality", "Analytical Thinker"),
                compatibleTypes = listOf(Sociotype.INTJ, Sociotype.INFJ),
                categoryName = "Analysts"
            ),
            Personality(
                name = "Counselor",
                sociotype = Sociotype.INFJ,
                description = listOf("Collaborative Personality", "Imaginative Thinker"),
                compatibleTypes = listOf(Sociotype.ENFP, Sociotype.ENTP, Sociotype.INTJ, Sociotype.INFJ),
                categoryName = "Diplomats"
            ),
            Personality(
                name = "Mediator",
                sociotype = Sociotype.INFP,
                description = listOf("Altruistic Personality", "Imaginative Thinker"),
                compatibleTypes = listOf(Sociotype.ENFJ, Sociotype.ENTJ),
                categoryName = "Diplomats"
            ),
            Personality(
                name = "Protagonist",
                sociotype = Sociotype.ENFJ,
                description = listOf("Empathetic Personality", "Imaginative Thinker"),
                compatibleTypes = listOf(Sociotype.INFP, Sociotype.INTP),
                categoryName = "Diplomats"
            ),
            Personality(
                name = "Champion",
                sociotype = Sociotype.ENFP,
                description = listOf("Vibrant Personality", "Individualistic Thinker"),
                compatibleTypes = listOf(Sociotype.INTJ, Sociotype.INFJ),
                categoryName = "Diplomats"
            ),
            Personality(
                name = "Inspector",
                sociotype = Sociotype.ISTJ,
                description = listOf("Reserved Personality", "Analytical Thinker"),
                compatibleTypes = listOf(Sociotype.ENTP, Sociotype.ENFP),
                categoryName = "Sentinels"
            ),
            Personality(
                name = "Defender",
                sociotype = Sociotype.ISFJ,
                description = listOf("Empathetic Personality", "Practical Thinker"),
                compatibleTypes = listOf(Sociotype.ESFP, Sociotype.ESTP),
                categoryName = "Sentinels"
            ),
            Personality(
                name = "Supervisor",
                sociotype = Sociotype.ESTJ,
                description = listOf("Decisive Personality", "Conformist Thinker"),
                compatibleTypes = listOf(Sociotype.ISTP, Sociotype.ISFP),
                categoryName = "Sentinels"
            ),
            Personality(
                name = "Provider",
                sociotype = Sociotype.ESFJ,
                description = listOf("Decisive Personality", "Social Thinker"),
                compatibleTypes = listOf(Sociotype.ISFP, Sociotype.ISTP),
                categoryName = "Sentinels"
            ),
            Personality(
                name = "Virtuoso",
                sociotype = Sociotype.ISTP,
                description = listOf("Vibrant Personality", "Practical Thinker"),
                compatibleTypes = listOf(Sociotype.ESFJ, Sociotype.ESTJ),
                categoryName = "Explorers"
            ),
            Personality(
                name = "Adventurer",
                sociotype = Sociotype.ISFP,
                description = listOf("Empathetic Personality", "Flexible Thinker"),
                compatibleTypes = listOf(Sociotype.ESTJ, Sociotype.ESFJ),
                categoryName = "Explorers"
            ),
            Personality(
                name = "Dynamo",
                sociotype = Sociotype.ESTP,
                description = listOf("Vibrant Personality", "Flexible Thinker"),
                compatibleTypes = listOf(Sociotype.ISTJ, Sociotype.ISFJ),
                categoryName = "Explorers"
            ),
            Personality(
                name = "Entertainer",
                sociotype = Sociotype.ESFP,
                description = listOf("Vibrant Personality", "Social Thinker"),
                compatibleTypes = listOf(Sociotype.ISTJ, Sociotype.ISFJ),
                categoryName = "Explorers"
            ),
        )
    }
}
