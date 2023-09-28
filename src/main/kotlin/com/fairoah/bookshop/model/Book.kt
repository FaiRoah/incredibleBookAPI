package com.fairoah.bookshop.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

@Entity
@Table(name = "books")
data class Book (
    @Id
    @JsonProperty("id")
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long = 0,

    @JsonProperty("name")
    @Column(name = "name", length = 100)
    val name: String = "",

    @JsonProperty("description")
    @Column(name = "description", length = 500)
    val description: String = ""


)