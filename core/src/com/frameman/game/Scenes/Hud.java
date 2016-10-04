package com.frameman.game.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.frameman.game.RunnerGame;


/**
 * Created by marco on 04/10/2016.
 */

public class Hud {
    public Stage stage;
    private Viewport viewport;

    private Integer worldTimer;
    private float timeCount;
    private Integer score;

    Label scoreLabel;
    Label timeLabel;
    Label runnerLabel;

    public Hud(SpriteBatch sb){
        worldTimer = 0;
        timeCount = 0;
        score = 0;

        viewport = new FitViewport(RunnerGame.V_WIDTH,RunnerGame.V_HEIGHT,new OrthographicCamera());
        stage = new Stage(viewport, sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        scoreLabel = new Label("SCORE", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        timeLabel = new Label("TIME", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        runnerLabel = new Label("YELLOW RUNNER", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(timeLabel).expandX().padTop(10);
        table.add(runnerLabel).expandX().padTop(10);
        table.add(scoreLabel).expandX().padTop(10);

        stage.addActor(table);
    }
}
