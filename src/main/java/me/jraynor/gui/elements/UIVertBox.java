package me.jraynor.gui.elements;

import me.jraynor.gui.logic.UIComponent;
import me.jraynor.gui.logic.constraint.Constraints;
import me.jraynor.gui.logic.constraint.UIConstraint;

import java.util.ArrayList;
import java.util.List;

import static me.jraynor.gui.logic.constraint.Constraints.ManualConstraint.NO_OVERRIDE;
import static me.jraynor.gui.logic.constraint.Constraints.StickyConstraint;
import static me.jraynor.gui.logic.constraint.Constraints.StickyConstraint.FACE.BOTTOM;
import static org.lwjgl.nanovg.NanoVG.*;


public class UIVertBox extends UIComponent {
    private float padding;
    private UIConstraint constraint;
    private UIConstraint lastConstraint;
    private List<UIConstraint> constraints = new ArrayList<>();
    private boolean fit;

    public UIVertBox(float padding) {
        this.padding = padding;
    }

    @Override
    public UIComponent add(UIComponent uiComponent) {
        if (uiComponent instanceof UIConstraint) {
            this.constraint = (UIConstraint) super.add(uiComponent);
            constraint.update();
            System.out.println(constraint.y);
            return this.constraint;
        } else if (uiComponent.hasComponent(UIConstraint.class)) {
            UIConstraint uiConstraint = (UIConstraint) uiComponent.getComponent(UIConstraint.class);
            if (lastConstraint != null)
                uiConstraint.setYConst(new StickyConstraint(BOTTOM, new Constraints.PixelConstraint(-padding)).setRelativeConstraint(lastConstraint));
            lastConstraint = uiConstraint;
            lastConstraint.update();
            constraints.add(lastConstraint);
            return super.add(uiComponent);
        } else if (uiComponent instanceof UIBlock) {
            UIBlock block = (UIBlock) super.add(uiComponent);
            if (!block.hasComponent(UIConstraint.class))
                block.add(UIConstraint.fill());
            return block;
        }
        return super.add(uiComponent);
    }

    public UIVertBox fill(boolean fill){
        this.fit = fill;
        return this;
    }


    @Override
    protected void onUpdate() {
        float maxSize = 0;
        if(fit){
            for (UIConstraint constraint : constraints) {
                if (constraint != null) {
                    if (constraint.getOverride() != null)
                        if (constraint.getOverride().getWOverride().isPresent()) {
                            if(constraint.getOverride().getWOverride().get() > maxSize)
                                maxSize = constraint.getOverride().getWOverride().get() + padding * 2;
                        }
                }
            }
            if (constraint.getOverride() == null) {
                this.constraint.setOverride(new Constraints.ManualConstraint(NO_OVERRIDE, NO_OVERRIDE, maxSize, NO_OVERRIDE));
            } else
                this.constraint.getOverride().setW(maxSize);
        }
    }


    @Override
    public void update() {
        nvgSave(vg);
        nvgScissor(vg, constraint.x, constraint.y, constraint.w, constraint.h);
        super.update();
        nvgResetScissor(vg);
        nvgRestore(vg);

    }
}
