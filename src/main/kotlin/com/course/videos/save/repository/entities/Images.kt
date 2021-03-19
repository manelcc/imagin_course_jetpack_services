package com.course.videos.save.repository.entities

import javax.persistence.*

@Entity
@Table(name="fileimage")
data class Images(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = -1,
    val namefile: String,
    val descripcionfile: String,
    val file: ByteArray? =null
)