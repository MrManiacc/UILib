package me.jraynor.gui.menus;

import me.jraynor.gui.UIMaster;
import me.jraynor.gui.elements.UIBlock;
import me.jraynor.gui.elements.UIHorzBox;
import me.jraynor.gui.elements.UIText;
import me.jraynor.gui.elements.UIVertBox;
import me.jraynor.gui.logic.UIComponent;
import me.jraynor.gui.logic.color.UIColor;
import me.jraynor.gui.logic.constraint.UIConstraint;

import static me.jraynor.gui.logic.constraint.Constraints.*;
import static me.jraynor.gui.logic.constraint.Constraints.StickyConstraint.FACE.*;


public class DebugMenu extends UIComponent {
    private UIConstraint menuConstraint, titleConstraint, horBoxConstraint, vertBoxConstraint, infoLabelConstraint;
    private UIBlock menuBlock, titleBlock;
    private UIHorzBox horzBox;
    private UIVertBox vertBox;

    @Override
    protected void onAdded() {
        createConstraints();
        createElements();
    }

    private void createConstraints() {
        menuConstraint = new UIConstraint()
                .setWConst(new FlexConstraint(10))
                .setHConst(new FlexConstraint(10))
                .setXConst(new StickyConstraint(LEFT, new PixelConstraint(10)))
                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)));
        titleConstraint = new UIConstraint()
                .setXConst(new CenterConstraint())
                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
                .setWConst(new RelativeConstraint(0.33f, null, new PixelConstraint(250)))
                .setHConst(new PixelConstraint(25));
        horBoxConstraint = new UIConstraint()
                .setXConst(new CenterConstraint())
                .setYConst(new StickyConstraint(BOTTOM, new PixelConstraint(-10)).setRelativeConstraint(titleConstraint))
                .setWConst(new RelativeConstraint(1))
                .setHConst(new PixelConstraint(200));
//                .setHConst(new FlexConstraint(10));
        vertBoxConstraint = new UIConstraint()
                .setXConst(new StickyConstraint(LEFT, new PixelConstraint(10)))
                .setYConst(new StickyConstraint(BOTTOM, new PixelConstraint(-10)).setRelativeConstraint(horBoxConstraint))
                .setWConst(new RelativeConstraint(1))
                .setHConst(new FlexConstraint(10));
        infoLabelConstraint = new UIConstraint()
                .setXConst(new StickyConstraint(LEFT, new RelativeConstraint(0)))
                .setYConst(new StickyConstraint(TOP, new PixelConstraint(10)))
                .setWConst(new RelativeConstraint(0.33f, null, new PixelConstraint(350)))
                .setHConst(new PixelConstraint(15));
    }

    private void createElements() {
        menuBlock = new UIBlock(UIColor.DARK_RED);
        menuBlock.add(menuConstraint);
        UIMaster.getRoot().add(menuBlock);
        createTitle();
        createInfoElements();
    }

    private void createTitle() {
        titleBlock = createLabel(menuBlock, titleConstraint, "RaynEngine 0.0.1", 48, UIColor.BLACK, UIColor.WHITE);
    }

    private void createInfoElements() {
        horzBox = new UIHorzBox(10).fill(true);
        horzBox.add(horBoxConstraint);
        menuBlock.add(horzBox);
        horzBox.add(new UIBlock(UIColor.LIGHT_PURPLE));


        vertBox = new UIVertBox(10).fill(true);
        vertBox.add(vertBoxConstraint);
        menuBlock.add(vertBox);
        vertBox.add(new UIBlock(UIColor.LIGHT_PURPLE));



        UIComponent vertBox2 = new UIVertBox(10).fill(true);
        UIConstraint vertBox2Constraint = new UIConstraint(vertBoxConstraint);
        vertBox2Constraint.setXConst(new StickyConstraint(RIGHT, new PixelConstraint(-10)).setRelativeConstraint(vertBox));
        vertBox2.add(vertBox2Constraint);
        menuBlock.add(vertBox2);
        vertBox2.add(new UIBlock(UIColor.LIGHT_PURPLE));



        UIComponent vertBox3 = new UIVertBox(10).fill(true);
        UIConstraint vertBox3Constraint = new UIConstraint(vertBoxConstraint);
        vertBox3Constraint.setXConst(new StickyConstraint(RIGHT, new PixelConstraint(-10)).setRelativeConstraint(vertBox2));
        vertBox3.add(vertBox3Constraint);
        menuBlock.add(vertBox3);
        vertBox3.add(new UIBlock(UIColor.LIGHT_PURPLE));


        createLabel(horzBox, infoLabelConstraint, "Testing", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(horzBox, new UIConstraint(infoLabelConstraint), "Testing2", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(horzBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(horzBox, new UIConstraint(infoLabelConstraint), "Testing2", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(horzBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);

        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);

        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);


        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);

        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);

        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox2, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);



        createLabel(vertBox3, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox3, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox3, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox3, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox3, new UIConstraint(infoLabelConstraint), "Testingasdfsf3", 20, UIColor.WHITE, UIColor.BLACK);
        createLabel(vertBox3, new UIConstraint(infoLabelConstraint), "Testing3", 20, UIColor.WHITE, UIColor.BLACK);
    }


    private UIBlock createLabel(UIComponent parent, UIConstraint constraint, String text, int fontSize, UIColor bgColor, UIColor textColor) {
        UIBlock uiBlock = new UIBlock(bgColor);
        uiBlock.add(constraint);
        UIText label = new UIText(text, "regular", fontSize, textColor).setFill(true);
        parent.add(uiBlock);
        uiBlock.add(label);
        return uiBlock;
    }
}
