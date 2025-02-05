package practica5

import kotlin.random.Random

const val MAX_BOOKS_BORROWED = 5

class Book(val title: String, val author: String, val year: Int, var pages: Int) {
    fun getTitleAndAuthor(): Pair<String, String> = Pair(title, author)
    fun getBookInfo(): Triple<String, String, Int> = Triple(title, author, year)

    fun canBorrow(borrowedBooks: Int): Boolean {
        return borrowedBooks < MAX_BOOKS_BORROWED
    }

    fun printUrl() {
        println("${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        private const val BASE_URL = "https://library.example.com/"
    }
}

fun Book.weight(): Double = pages * 1.5

fun Book.tearPages(amount: Int) {
    pages = if (pages - amount > 0) pages - amount else 0
}

class Puppy {
    fun playWithBook(book: Book) {
        val tornPages = Random.nextInt(1, 10)
        println("The puppy tore $tornPages pages!")
        book.tearPages(tornPages)
    }
}

fun book5() {
    val book = Book("1984", "George Orwell", 1949, 300)
    val (title, author) = book.getTitleAndAuthor()
    val (fullTitle, fullAuthor, year) = book.getBookInfo()
    println("Here is your book '$fullTitle' written by $fullAuthor in $year.")

    val allBooks = setOf("Hamlet", "Othello", "Macbeth")
    val library = mapOf("William Shakespeare" to allBooks)

    val containsHamlet = library.any { it.value.contains("Hamlet") }
    println("Does the library contain Hamlet? $containsHamlet")

    val moreBooks = mutableMapOf("J.K. Rowling" to "Harry Potter and the Sorcerer's Stone")
    moreBooks.getOrPut("J.R.R. Tolkien") { "The Hobbit" }
    println("More books: $moreBooks")

    println("Can borrow more books? ${book.canBorrow(3)}")
    book.printUrl()

    println("Book weight: ${book.weight()} grams")

    val puppy = Puppy()
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Remaining pages: ${book.pages}")
    }
    println("Oh no! The book has no pages left.")
}
