rootProject.name = "ddd-study-board"

include(":server")
include(":shared")
include(":user-module")
include(
    ":user-module:user-domain",
)
include(":board-module")
include(
    ":board-module:board-domain",
)
include(":follow-module")
include(
    ":follow-module:follow-domain",
)
include(":notification-module")
include(
    ":notification-module:notification-domain",
)
