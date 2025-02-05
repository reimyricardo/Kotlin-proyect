package practica4
open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
        println("Reading page $currentPage of $title")
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
        println("Reading eBook: $wordCount words read in $title")
    }
}

fun libreria() {
    val physicalBook = Book("Moby Dick", "Herman Melville")
    physicalBook.readPage()

    val digitalBook = eBook("1984", "George Orwell")
    digitalBook.readPage()
}
