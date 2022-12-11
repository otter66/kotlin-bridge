package bridge.model

import bridge.values.*

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
class BridgeGame (
    private val bridgeSize: Int,
    private val bridge: List<String>
) {

    private var activateStatus = GAME_STATUS_ACTIVATE
    private var progress: List<MutableList<String>> = List(BRIDGE_OPTION_NUMBER) { mutableListOf() }
    private var moveCount = 0
    private var tryCount = 0


    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     *
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun move(movement: String) {
        updateProgress(movement)
        moveCount++
        if (bridgeSize <= moveCount) endGame()
    }

    private fun updateProgress(movement: String) {
        if (movement == Movement.UP.command) {
            progress[Movement.UP.index].add(if (isCorrectMovement(movement)) CORRECT_MOVEMENT else INCORRECT_MOVEMENT)
            progress[Movement.DOWN.index].add(EMPTY_SPACE)
        }
        else {
            progress[Movement.DOWN.index].add(if (isCorrectMovement(movement)) CORRECT_MOVEMENT else INCORRECT_MOVEMENT)
            progress[Movement.UP.index].add(EMPTY_SPACE)
        }
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     *
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun retry() {
        progress = List(BRIDGE_OPTION_NUMBER) { mutableListOf() }
        moveCount = 0
        tryCount++
    }

    fun isCorrectMovement(movement: String) = movement == bridge[moveCount]

    fun isGameEnd() = activateStatus != GAME_STATUS_ACTIVATE

    fun isGameSuccess(): Boolean {
        repeat(progress.size) { index ->
            if (progress[index].contains(INCORRECT_MOVEMENT)) return false
        }
        return true
    }

    fun endGame() {
        activateStatus = GAME_STATUS_INACTIVATE
    }

    fun getProgress() = progress
}
