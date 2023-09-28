package com.fairoah.bookshop.repository

import com.fairoah.bookshop.model.Book
import org.springframework.data.repository.CrudRepository


interface bookRepository : CrudRepository<Book, Long>