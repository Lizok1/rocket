enum class Role {
    CAPTAIN(5),
    NAVIGATOR(8),
    MECHANIC(6),
    DOCTOR(12),
    ENGINEER(7),
    COOK(0),
    STEWARD(0),
    STEWARDESS(0),
    IMPOSTER(0);
    val experience: Int
    constructor(experience: Int){
        this.experience = experience
    }
}