package d003.abstractcls;

public abstract class ImmutableAbstractFruit {
    private int fruit_id;
    private String fruitName;
    private int healthLevel;

    public ImmutableAbstractFruit(int fruit_id, String fruitName, int healthLevel) {
        this.fruit_id = fruit_id;
        this.fruitName = fruitName;
        this.healthLevel = healthLevel;
    }

    public int getFruit_id() {
        return fruit_id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
