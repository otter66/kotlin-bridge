package bridge.controller

import bridge.model.BridgeGame
import bridge.values.BRIDGE_SIZE_CONDITION_ERROR_MESSAGE
import bridge.values.NOTICE_GAME_START_MESSAGE
import bridge.view.InputView
import bridge.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {

    fun runGame() {
        val bridgeGame: BridgeGame = createGame()
    }

    /**
     * 게임의 정보(다리의 길이, 다리 정보)를 취합해 게임을 생성한다.
     */
    private fun createGame(): BridgeGame {
        outputView.printMessage(NOTICE_GAME_START_MESSAGE)
        val bridgeSize = getValidatedBridgeSize()

        return BridgeGame()
    }


    private fun getValidatedBridgeSize(): Int {
        while (true) {
            try {
                return inputView.readBridgeSize()
            } catch (e: IllegalArgumentException) {
                throw e
            }
        }
    }

    private fun getValidatedMovement(): String {
        while (true) {
            try {
                return inputView.readMoving()
            } catch (e: IllegalArgumentException) {
                throw e
            }
        }
    }

    private fun getValidatedGameCommand(): String {
        while (true) {
            try {
                return inputView.readGameCommand()
            } catch (e: IllegalArgumentException) {
                throw e
            }
        }
    }

}