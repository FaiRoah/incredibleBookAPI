package com.fairoah.bookshop.service

import com.fairoah.bookshop.model.Book
import com.fairoah.bookshop.repository.bookRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService(private val bookRepository: bookRepository) {
    fun all(): Iterable<Book> = bookRepository.findAll()

    fun get(id: Long): Optional<Book> = bookRepository.findById(id) //not sure about the Optional return type

    fun add(book: Book): Book = bookRepository.save(book)

    fun edit(id: Long, book: Book): Book = bookRepository.save(book.copy(id = id)) // Сохраняем копию объекта с указанным id в БД. Идиоматика Kotlin говорит что НЕ изменяемый - всегда лучше чем изменяемый (никто не поправит значение в другом потоке) и предлагает метод copy для копирования объектов (специальных классов для хранения данных) с возможностью замены значений

    fun remove(id: Long) = bookRepository.deleteById(id)


}