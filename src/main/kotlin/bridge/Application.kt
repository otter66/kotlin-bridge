package bridge

import bridge.controller.GameController
import bridge.domain.BridgeMaker
import bridge.domain.Validator
import bridge.view.InputView
import bridge.view.OutputView

fun main() {

    val validator = Validator()
    val outputView = OutputView()
    val inputView = InputView(outputView, validator)
    val bridgeGame = GameController(inputView, outputView)

    bridgeGame.runGame()

}
