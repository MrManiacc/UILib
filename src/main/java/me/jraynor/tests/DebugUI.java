package me.jraynor.tests;

import me.jraynor.gui.UIMaster;
import me.jraynor.gui.elements.UIBlock;
import me.jraynor.gui.elements.UIHorzBox;
import me.jraynor.gui.elements.UISeparator;
import me.jraynor.gui.elements.UIText;
import me.jraynor.gui.logic.UIComponent;
import me.jraynor.gui.logic.color.UIColor;
import me.jraynor.gui.logic.constraint.Constraints;
import me.jraynor.gui.logic.constraint.UIConstraint;
import me.jraynor.gui.menus.DebugMenu;

import java.util.Date;

import static me.jraynor.gui.logic.constraint.Constraints.*;
import static me.jraynor.gui.logic.constraint.Constraints.StickyConstraint.FACE.*;


public class DebugUI {
    public static void createUI() throws CloneNotSupportedException {
        UIComponent root = UIMaster.getRoot();

        DebugMenu debugMenu = new DebugMenu();


        root.add(debugMenu);
//        UIComponent container = new UIBlock(UIColor.DARK_PURPLE);
//        container.add(new UIConstraint()
//                .setXConst(new StickyConstraint(LEFT, new PixelConstraint(10)))
//                .setYConst(new Constraints.StickyConstraint(TOP, new PixelConstraint(10)))
//                .setWConst(new RelativeConstraint(0.5f, new PixelConstraint(200), new PixelConstraint(550)))
//                .setHConst(new RelativeConstraint(0.5f)));
//
//        UIComponent gameInfo = new UIBlock(UIColor.rgba(0, 0, 0, 60));
//        gameInfo.add(new UIConstraint()
//                .setXConst(new CenterConstraint())
//                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
//                .setWConst(new RelativeConstraint(0.9f))
//                .setHConst(new PixelConstraint(30)));
//        UIComponent gameInfoLabel = new UIText("RaynLib - 0.0.1", "bold", 24, UIColor.WHITE);
//
//        UIComponent vBox = new UIHorzBox(10).fill(true);
//        vBox.add(new UIConstraint()
//                .setXConst(new CenterConstraint())
//                .setYConst(new Constraints.StickyConstraint(BOTTOM, new PixelConstraint(-10)).setRelativeConstraint(gameInfo))
//                .setWConst(new RelativeConstraint(1))
//                .setHConst(new RelativeConstraint(1, new PixelConstraint(-10))));
//
//        UIComponent gameFPS = new UIBlock(UIColor.rgba(0, 0, 0, 60));
//        gameFPS.add(new UIConstraint()
//                .setXConst(new StickyConstraint(LEFT, new RelativeConstraint(0.05f)))
//                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
//                .setWConst(new RelativeConstraint(0.33f, null, new PixelConstraint(350)))
//                .setHConst(new PixelConstraint(15)));
//        UIComponent gameFPSLabel = new UIText("FPS: 692", "regular", 20, UIColor.WHITE).setFill(true);
//        UIComponent gameTPS = new UIBlock(UIColor.rgba(255, 255, 255, 120));
//
//        gameTPS.add(new UIConstraint()
//                .setXConst(new StickyConstraint(RIGHT, new PixelConstraint(10)))
//                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
//                .setWConst(new RelativeConstraint(0.33f, null, new PixelConstraint(350)))
//                .setHConst(new PixelConstraint(15)));
//        UIComponent gameTPSLabel = new UIText("TPS: 20", "regular", 20, UIColor.BLACK).setFill(true);
//        UIComponent gameDate = new UIBlock(UIColor.rgba(0, 0, 0, 60));
//        gameDate.add(new UIConstraint()
//                .setXConst(new StickyConstraint(LEFT, new RelativeConstraint(0.05f)))
//                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
//                .setWConst(new RelativeConstraint(0.33f, null, new PixelConstraint(350)))
//                .setHConst(new PixelConstraint(15)));
//        UIComponent gameDateLabel = new UIText("Date: " + new Date().toLocaleString(), "regular", 20, UIColor.WHITE).setFill(true);
//
//
//        UIComponent otherThing = new UIBlock(UIColor.rgba(255, 255, 255, 120));
//        otherThing.add(new UIConstraint()
//                .setXConst(new StickyConstraint(LEFT, new RelativeConstraint(0.05f)))
//                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
//                .setWConst(new RelativeConstraint(0.33f, null, new PixelConstraint(350)))
//                .setHConst(new PixelConstraint(15)));
//        UIComponent otherThingLabel = new UIText("Some other shit", "regular", 20, UIColor.BLACK).setFill(true);
//
//
//        root.add(container);
//
//        container.add(gameInfo);
//        container.add(vBox);
//
//        vBox.add(new UIBlock(UIColor.LIGHT_RED));
//
//        vBox.add(gameFPS);
//        vBox.add(gameTPS);
//        vBox.add(gameDate);
//        vBox.add(otherThing);
//
//
//        gameInfo.add(gameInfoLabel);
//        gameFPS.add(gameFPSLabel);
//        gameTPS.add(gameTPSLabel);
//        gameDate.add(gameDateLabel);
//        otherThing.add(otherThingLabel);

    }

}
