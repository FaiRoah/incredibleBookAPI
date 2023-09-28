package com.fairoah.bookshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
class BookshopApplication

fun main(args: Array<String>) {
	runApplication<BookshopApplication>(*args)
}
