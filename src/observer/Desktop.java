package observer;


public class Desktop extends Client{
    private int temperature = 0;
    @Override
    public void updateValue(int value) {
        this.temperature = value;
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }
}