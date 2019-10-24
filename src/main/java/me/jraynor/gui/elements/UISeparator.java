package me.jraynor.gui.elements;

import me.jraynor.gui.logic.UIComponent;
import me.jraynor.gui.logic.color.UIColor;
import me.jraynor.gui.logic.constraint.UIConstraint;
import me.jraynor.gui.misc.UIRenderable;
import static me.jraynor.gui.logic.constraint.Constraints.*;
public class UISeparator extends UIComponent implements UIRenderable {
    private UIColor color;
    private UIConstraint constraints;

    public UISeparator(UIColor color) {
        this.color = color;
    }

    @Override
    public UIComponent add(UIComponent uiComponent) {
        if (uiComponent instanceof UIConstraint) {
            if (hasComponent(uiComponent.getClass()))
                remove(uiComponent);
            UIConstraint uiConstraint = (UIConstraint) super.add(uiComponent);
            this.constraints = uiConstraint;
            return uiConstraint;
        }
        return super.add(uiComponent);
    }

    @Override
    public void setParent(UIComponent parent) {
        if (constraints == null) {
            add(new UIConstraint()
                    .setXConst(new CenterConstraint())
                    .setYConst(new StickyConstraint(StickyConstraint.FACE.BOTTOM, new PixelConstraint(-4)))
                    .setWConst(new RelativeConstraint())
                    .setHConst(new PixelConstraint(1)));
        }
        setRender(true);
        super.setParent(parent);
    }

    @Override
    protected void render() {
        drawColoredRect(vg, constraints.x, constraints.y, constraints.w, constraints.h, color);
    }
}
