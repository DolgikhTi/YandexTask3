fun main() {
    val n = readLine()!!.toInt() // Чтение количества элементов
    val array = readLine()!!.split(" ").map { it.toInt() }.toMutableList() // Чтение массива

    val swaps = mutableListOf<Pair<Int, Int>>() // Список обменов
    var left = 0 // Левый указатель
    var right = n - 1 // Правый указатель

    while (left < right) {
        // Двигаем left вправо, пока не найдем единицу
        while (left < right && array[left] == 0) {
            left++
        }
        // Двигаем right влево, пока не найдем ноль
        while (left < right && array[right] == 1) {
            right--
        }
        // Если left < right, меняем местами
        if (left < right) {
            swaps.add(left to right) // Добавляем обмен в список
            array[left] = 0
            array[right] = 1
            left++
            right--
        }
    }

    // Вывод результата
    println(swaps.size) // Количество обменов
    for ((l, r) in swaps) {
        println("$l $r") // Пары индексов для обменов
    }
}