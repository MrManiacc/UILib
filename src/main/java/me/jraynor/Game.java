package me.jraynor;

import lombok.Getter;
import me.jraynor.bootstrap.IEngine;
import me.jraynor.bootstrap.Window;
import me.jraynor.gui.UIMaster;
import me.jraynor.tests.DebugUI;

public class Game implements IEngine {
    @Getter
    private static final Window win = new Window(1920, 1080, false, true, false, "UIBuilder");

    public static void main(String[] args) {
        win.start(new Game());
    }

    @Override
    public void preInit() {

    }

    @Override
    public void postInit() {
        UIMaster.createUIMaster(win);

        //Temp code for testing
        try {
            DebugUI.createUI();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(double delta) {

    }

    public void renderUI(double delta){
        UIMaster.update(win);
    }

    @Override
    public void update(double tick) {
    }
}
