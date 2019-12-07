package com.mygdx.game

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.mygdx.game.screen.UnitsScreen

class MyGdxGame : Game() {

    private lateinit var unitsScreen: UnitsScreen

    override fun create() {
        unitsScreen = UnitsScreen()
        unitsScreen.hide()
    }

    override fun render() {
        unitsScreen.render(Gdx.graphics.deltaTime)
    }

    override fun dispose() {

    }
}