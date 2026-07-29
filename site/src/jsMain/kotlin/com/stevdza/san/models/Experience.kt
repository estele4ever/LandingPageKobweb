package com.stevdza.san.models

import com.stevdza.san.util.Constants.freelance_experience
import com.stevdza.san.util.Constants.kotlin_experience
import com.stevdza.san.util.Constants.web_experience

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Kotlin Multi-Platform Developer",
        description = kotlin_experience,
        company = "Orion",
        from = "July 2025",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Web Developer",
        description = web_experience,
        company = "Tea-sea",
        from = "febuary 2023",
        to = "October 2024",
    ),
    Third(
        number = "03",
        jobPosition = "One Search",
        description = freelance_experience,
        company = "UY1",
        from = "March 2022",
        to = "August 2022",
    )
}