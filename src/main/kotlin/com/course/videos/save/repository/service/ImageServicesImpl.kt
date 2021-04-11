package com.course.videos.save.repository.service

import com.course.videos.save.repository.ImagesRepository
import com.course.videos.save.repository.entities.Images
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.IOException
import kotlin.jvm.Throws
import org.springframework.util.StringUtils;


@Service
public class ImageServicesImpl: ImageServices {

    @Autowired
    lateinit var  repoImages: ImagesRepository

    override fun getAllAlbums(): List<Images> {
        return repoImages.findAll()
    }

    @Throws(IOException::class)
    override fun save(file: MultipartFile): Images {
        val fileName: String = StringUtils.cleanPath(file.originalFilename!!)
        val album = Images(null,fileName, file.contentType!!, file.bytes)
        return repoImages.save(album)
    }

}