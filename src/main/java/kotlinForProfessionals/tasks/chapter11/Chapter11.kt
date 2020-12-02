package kotlinForProfessionals.tasks


fun removeBeggarUsers(allUsers: Map<String, Int>): Map<String, Int> {

    val richUsers = mutableMapOf<String, Int>()

    allUsers.forEach {
        if (it.value != 0) {
            richUsers.put(it.key, it.value)
        }
    }
    return richUsers.toMap()
}