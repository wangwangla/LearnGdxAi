package kw.test.pacmen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import kw.test.pacmen.screen.GameScreen;

public class PacmanGame extends Game {
//  创建画笔
    private static SpriteBatch batch;
//  视口
    private static ExtendViewport viewport;
    //    资源管理组件
    private static AssetManager assetManager;

    @Override
    public void create() {
        setScreen(new GameScreen());
    }

    public static ExtendViewport getViewport(){
        if (viewport == null){
            viewport = new ExtendViewport(19.0F,23.0F);
            viewport.getCamera();
        }
        return viewport;
    }

    public static AssetManager getAssetManager() {
        if (assetManager == null){
            assetManager = new AssetManager();
        }
        return assetManager;
    }

    public static SpriteBatch getBatch() {
        if (batch==null){
            batch = new SpriteBatch();
        }
        return batch;
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        if (viewport!=null)
        viewport.update(width,height);
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
    }
}
