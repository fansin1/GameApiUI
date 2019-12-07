package com.mygdx.game

import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import org.fansin.gameapi.Unit

class UnitActor(val unit: Unit, val icon: TextureRegion) : Actor() {
    val drawableIcon = TextureRegionDrawable(icon)

    init {

    }

}