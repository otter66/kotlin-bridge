package bridge.domain

import bridge.values.*

class Validator {

    fun checkBridgeSize(bridgeSize: String) {
        require(bridgeSize.all { it in '0'..'9' } &&
            bridgeSize.toInt() in BRIDGE_SIZE_BOUNDARY_START..BRIDGE_SIZE_BOUNDARY_END
        ) {
            BRIDGE_SIZE_CONDITION_ERROR_MESSAGE
        }
    }

    fun checkMoving(movement: String) {
        require(movement == Movement.UP.command ||
            movement == Movement.DOWN.command
        ) {
            MOVEMENT_CONDITION_ERROR_MESSAGE
        }
    }

    fun checkGameCommand(gameCommand: String) {
        require(gameCommand == GAME_RETRY_COMMAND ||
            gameCommand == GAME_QUIT_COMMAND
        ) {
            GAME_RETRY_COMMAND_CONDITION_ERROR_MESSAGE
        }
    }

}