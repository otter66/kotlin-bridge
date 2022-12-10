package bridge.view

import bridge.domain.Validator
import bridge.values.REQUIRE_BRIDGE_LENGTH_MESSAGE
import bridge.values.REQUIRE_GAME_RETRY_COMMAND_MESSAGE
import bridge.values.REQUIRE_MOVEMENT_MESSAGE
import camp.nextstep.edu.missionutils.Console

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
class InputView(
    private val output: OutputView,
    private val validator: Validator
) {

    /**
     * 다리의 길이를 입력받는다.
     */
    fun readBridgeSize(): Int {
        output.printMessage(REQUIRE_BRIDGE_LENGTH_MESSAGE)
        val input = Console.readLine()

        validator.checkBridgeSize(input)

        return input.toInt()
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    fun readMoving(): String {
        output.printMessage(REQUIRE_MOVEMENT_MESSAGE)
        val input = Console.readLine()

        validator.checkMoving(input)

        return input
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        output.printMessage(REQUIRE_GAME_RETRY_COMMAND_MESSAGE)
        val input = Console.readLine()

        validator.checkGameCommand(input)

        return input
    }
}
