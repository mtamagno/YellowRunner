package com.frameman.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.frameman.game.RunnerGame;
import com.frameman.game.Scenes.Hud;
import com.sun.prism.image.ViewPort;

/**
 * Created by marco on 04/10/2016.
 */

public class PlayScreen implements Screen {
    private RunnerGame game;
    Texture texture;
    private OrthographicCamera camera;
    private Viewport view;
    private Hud hud;

    public PlayScreen(RunnerGame game){
        this.game = game;
        texture = new Texture("badlogic.jpg");
        camera = new OrthographicCamera();
        view = new FitViewport(RunnerGame.V_WIDTH, RunnerGame.V_HEIGHT, camera);
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        view.update(width, height);


    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
