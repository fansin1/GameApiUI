package com.mygdx.game

import com.badlogic.gdx.scenes.scene2d.Group

class UnitActorGroup : Group() {

    private val unitActors = mutableListOf<UnitActor>()

    fun addUnitActor(unitActor: UnitActor) {
        if (unitActors.isEmpty()) {
            unitActor.setPosition(0f, 0f)
            val lastActor = unitActors.last()
            val lastIcon = unitActors.last().icon
            unitActor.setPosition(lastIcon.regionWidth + lastActor.x, 0f)
        }
        unitActors.add(unitActor)
    }

    fun removeUnitActor(unitActor: UnitActor) {
        unitActors.remove(unitActor)
    }

}