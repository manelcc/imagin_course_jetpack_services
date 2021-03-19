package com.course.videos.save.repository

import com.course.videos.save.repository.entities.Images
import org.springframework.data.jpa.repository.JpaRepository

interface ImagesRepository:JpaRepository<Images,Int> {
}