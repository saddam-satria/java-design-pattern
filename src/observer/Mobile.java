
package observer;

public class Mobile extends Client{
    private int temperature = 2;
    @Override
    public void updateValue(int value) {
        this.temperature = value;
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }
}