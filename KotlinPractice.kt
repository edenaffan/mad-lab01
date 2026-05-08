// ============================================================
// KotlinPractice.kt — LAB 1 Kotlin Exercises
// Mobile Application Development | SUZA | Semester II 2025/2026
// ============================================================

fun main() {
    println("========== 1. Variables & Types ==========")
    exercise1()

    println("\n========== 2. Area of a Rectangle ==========")
    exercise2()

    println("\n========== 3. Grade Calculator ==========")
    exercise3()

    println("\n========== 4. FizzBuzz (1..30) ==========")
    exercise4()

    println("\n========== 5. List Operations ==========")
    exercise5()

    println("\n========== 6. Classes ==========")
    exercise6()

    println("\n========== 7. Null Safety ==========")
    exercise7()
}


// Exercise 1 — Variables & Types

fun exercise1() {
    val name = "Affan Abuubakar Hassan"  
    var age = 21                          
    println("My name is $name and I am $age years old.")

    age = 22  
    println("Next year I will be $age years old.")
}


// Exercise 2 — Function: Area of a Rectangle

fun area(width: Double, height: Double): Double {
    return width * height
}

fun exercise2() {
    println("area(3.0, 4.0) = ${area(3.0, 4.0)}")   
    println("area(5.5, 2.0) = ${area(5.5, 2.0)}")   
}


// Exercise 3 — Control Flow: Grade Calculator

fun grade(score: Int): String {
    return when {
        score >= 80 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else        -> "F"
    }
}

fun exercise3() {
    val testScores = listOf(95, 72, 65, 53, 40)
    for (score in testScores) {
        println("Score: $score -> Grade: ${grade(score)}")
    }
}


// Exercise 4 — Loop: FizzBuzz (1..30)

fun exercise4() {
    for (i in 1..30) {
        println(
            when {
                i % 15 == 0 -> "FizzBuzz"   
                i % 3  == 0 -> "Fizz"
                i % 5  == 0 -> "Buzz"
                else        -> i.toString()
            }
        )
    }
}


// Exercise 5 — List Operations

fun exercise5() {
    val nums = listOf(1, 2, 3, 4, 5, 6)

    // Sum of all elements
    println("Sum: ${nums.sum()}")

    // Only even numbers
    val evens = nums.filter { it % 2 == 0 }
    println("Even numbers: $evens")

    // Each number doubled
    val doubled = nums.map { it * 2 }
    println("Doubled: $doubled")
}

// Exercise 6 — Classes

class Course(val code: String, val title: String, val credits: Int) {
    override fun toString(): String {
        return "[$code] $title ($credits credits)"
    }
}

fun exercise6() {
    val courses = listOf(
        Course("BITA201", "Mobile Application Development", 3),
        Course("BITA202", "Web Development", 3),
        Course("BITA203", "Cost Accounting", 2)
    )

    for (course in courses) {
        println(course)  // calls toString() automatically
    }
}

// Exercise 7 — Null Safety

fun exercise7() {
    // Simulating a nullable String (as if from readLine())
    val name: String? = "Affan"   // Try changing to null to test null safety

    // ?. is the safe-call operator:
    //   name?.length means "call .length only if name is NOT null"
    //   If name IS null, the whole expression evaluates to null (no crash)
    //
    // ?: is the Elvis operator:
    //   expression ?: defaultValue means "use expression if it's not null,
    //   otherwise use defaultValue"
    //   So name?.length ?: 0 means: if name is null, return 0 instead of null

    println("Length of name: ${name?.length ?: 0}")

    // Demonstrate with null
    val nullName: String? = null
    println("Length of nullName: ${nullName?.length ?: 0}")  // prints 0
}
