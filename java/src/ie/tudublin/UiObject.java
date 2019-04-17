package ie.tudublin;

public abstract class UiObject
{
    protected float x;
    protected float y;
    protected float z;

    protected float third;
    protected float quart;
    protected float diameter;
    protected float radius;
    protected float rotation;
    protected UI ui;

    public UiObject(UI ui, float x, float y, float z, float third, float quart, float diameter, float radius, float rotation)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
        this.third = third;
        this.quart = quart;
        this.diameter = diameter;
        this.radius = radius;
        this.rotation = rotation;
      

    }

    public UiObject(UI ui, float x, float y, float z) {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
	}

	public abstract void update();

    public abstract void render();

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public float getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(float z) {
        this.z = z;
    }

    /**
     * @return the third
     */
    public float getThird() {
        return third;
    }

    /**
     * @param third the third to set
     */
    public void setThird(float third) {
        this.third = third;
    }

    /**
     * @return the quart
     */
    public float getQuart() {
        return quart;
    }

    /**
     * @param quart the quart to set
     */
    public void setQuart(float quart) {
        this.quart = quart;
    }

    /**
     * @return the diameter
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }
}