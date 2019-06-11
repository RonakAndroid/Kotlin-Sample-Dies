package com.example.diesroller.Book

open class Book(
    var Title: String,
    var author: String
) {

    private var currentPage = 0

    open fun readpage() {
        currentPage += 1
    }
}

class eBook(var bookauthor: String, var bookname: String) : Book("Rahul ki book", "Ronak Author") {

    var WordCount: Int = 0

    override fun readpage() {
        WordCount = WordCount + 250
        println(WordCount)
    }

    fun printvalues(): String {
        println("Bookname ::" + bookauthor)
        println("Author ::" + bookname)
        return bookauthor
    }

}