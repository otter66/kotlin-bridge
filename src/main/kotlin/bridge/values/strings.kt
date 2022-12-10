package bridge.values

// game retry command
const val GAME_RETRY_COMMAND = "R"
const val GAME_QUIT_COMMAND = "Q"

// input require message
const val REQUIRE_BRIDGE_LENGTH_MESSAGE = "다리의 길이를 입력해주세요."
const val REQUIRE_MOVEMENT_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)"
const val REQUIRE_GAME_RETRY_COMMAND_MESSAGE = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"

// notice message
const val NOTICE_GAME_START_MESSAGE = "다리 건너기 게임을 시작합니다."
const val NOTICE_GAME_RESULT_MESSAGE = "최종 게임 결과"
const val NOTICE_GAME_SUCCESS_OR_NOT_MESSAGE = "게임 성공 여부: %s"
const val NOTICE_GAME_TRY_COUNT_MESSAGE = "총 시도한 횟수: %d"

// value condition message
private const val BRIDGE_SIZE_CONDITION_MESSAGE = "다리 길이는 3부터 20 사이의 숫자여야 합니다."
private const val MOVEMENT_CONDITION_MESSAGE = "이동할 칸은 'U' 또는 'D'만 입력할 수 있습니다."
private const val GAME_RETRY_COMMAND_CONDITION_MESSAGE = "게임 재시작 여부는 'R' 또는 'Q'만 입력할 수 있습니다."

// error message
private const val ERROR_MESSAGE = "[ERROR]"

// single character
private const val SPACE = " "

const val BRIDGE_SIZE_CONDITION_ERROR_MESSAGE = ERROR_MESSAGE + SPACE + BRIDGE_SIZE_CONDITION_MESSAGE
const val MOVEMENT_CONDITION_ERROR_MESSAGE = ERROR_MESSAGE + SPACE + MOVEMENT_CONDITION_MESSAGE
const val GAME_RETRY_COMMAND_CONDITION_ERROR_MESSAGE = ERROR_MESSAGE + SPACE + GAME_RETRY_COMMAND_CONDITION_MESSAGE
