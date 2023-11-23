package com.example.kmppractice

import kotlinx.datetime.*

fun daysUntilNewYear(): Int {
    val date = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    val today = date.date
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(closestNewYear)
}