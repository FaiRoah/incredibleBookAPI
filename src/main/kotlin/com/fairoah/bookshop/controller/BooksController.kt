package com.fairoah.bookshop.controller

import com.fairoah.bookshop.model.Book
import com.fairoah.bookshop.service.BookService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books")
class BooksController (private val bookService: BookService) {
    @GetMapping
    fun index() =
        bookService.all()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody book: Book) =
        bookService.add(book)

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Long) =
        bookService.get(id)

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody book: Book) = bookService.edit(
        id,
        book
    )

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) = bookService.remove(id)
}