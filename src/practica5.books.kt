package practica5

class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAndAuthor(): Pair<String, String> = Pair(title, author)
    fun getBookInfo(): Triple<String, String, Int> = Triple(title, author, year)
}

fun Book5() {
    val book = Book("1984", "George Orwell", 1949)
    val (title, author) = book.getTitleAndAuthor()
    val (fullTitle, fullAuthor, year) = book.getBookInfo()
    println("Here is your book $fullTitle written by $fullAuthor in $year.")
}