public class ElementBuilder {
    private Element element;

    public ElementBuilder() {
        element = new Element();
    }

    public ElementBuilder name(String name) {
        this.element.setName(name);
        return this;
    }
    public ElementBuilder appearance(String appearance) {
        this.element.setAppearance(appearance);
        return this;
    }
    public ElementBuilder atomic_Mass() {
        return this;
    }

    public ElementBuilder boil() {
        return this;
    }
    public ElementBuilder category() {
        return this;
    }

    public ElementBuilder color() {
        return this;
    }
    public ElementBuilder density() {
        return this;
    }

    public ElementBuilder discovered_By() {
        return this;
    }
    public ElementBuilder melt() {
        return this;
    }

    public ElementBuilder molar_heat() {
        return this;
    }
    public ElementBuilder named_By() {
        return this;
    }

    public ElementBuilder number() {
        return this;
    }
    public ElementBuilder period() {
        return this;
    }

    public ElementBuilder phase() {
        return this;
    }
    public ElementBuilder source() {
        return this;
    }

    public ElementBuilder spectral_img() {
        return this;
    }
    public ElementBuilder summary() {
        return this;
    }

    public ElementBuilder symbol() {
        return this;
    }
    public ElementBuilder xpos() {
        return this;
    }

    public ElementBuilder ypos() {
        return this;
    }
    public ElementBuilder shells() {
        return this;
    }


    public Element build() {
        return element;
    }
}
