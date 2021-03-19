package com.course.videos.save.repository.service

import com.course.videos.save.repository.entities.Images
import org.springframework.web.multipart.MultipartFile

interface ImageServices {
    fun getAllAlbums():List<Images>
    fun save(file: MultipartFile): Images
}