package com.course.videos.save

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class SaveApplication

fun main(args: Array<String>) {
	runApplication<SaveApplication>(*args)
}
