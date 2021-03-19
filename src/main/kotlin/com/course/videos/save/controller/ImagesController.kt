package com.course.videos.save.controller

import com.course.videos.save.repository.entities.Images
import com.course.videos.save.repository.service.ImageServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.http.ResponseEntity



@RestController
@RequestMapping("/api")
class ImagesController {

    @Autowired
    lateinit var imageServices: ImageServices

    @GetMapping("/")
    fun welcome():String{
       return "home"
    }

    @GetMapping("/getImages")
    fun findAll(): List<Images> {
        return imageServices.getAllAlbums()
    }

    @PostMapping("/saveImages")
    fun saveImage(@RequestParam("file") file: MultipartFile, @RequestParam("filename") filename: String): ResponseEntity<Any> {
        lateinit var status: ResponseEntity<Any>
        kotlin.runCatching {
            imageServices.save(file)
        }.onSuccess {
            status = ResponseEntity.ok().build()

        }.onFailure {
            val errorSave  = ResponseEntity.badRequest()
            errorSave.body(it.message)
            status = errorSave.build()

        }
        return status
    }
}