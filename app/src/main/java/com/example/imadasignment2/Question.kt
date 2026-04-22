package com.example.imadasignment2

import java.io.Serializable

data class Question(
    val statement: String,
    val isHack: Boolean,
    val explanation: String
) : Serializable
