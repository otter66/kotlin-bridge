package bridge.values

enum class Movement (
    val generateNumber: Int,
    val command: String,
    val index: Int
) {
    UP(1, "U", 0),
    DOWN(0, "D", 1)
}

