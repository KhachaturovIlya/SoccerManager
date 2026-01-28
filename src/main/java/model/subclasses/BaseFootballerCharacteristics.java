package model.subclasses;


import com.fasterxml.jackson.annotation.JsonSetter;

public class BaseFootballerCharacteristics {
    private short[] _characteristics;

    public BaseFootballerCharacteristics() {
        _characteristics = new short[FootballerCharacteristicsEnum.cnt];
    }

    public short characteristic(FootballerCharacteristicsEnum characteristic) {
        return _characteristics[characteristic.array_pos];
    }

	@JsonSetter
    public void increaseCharacteristic(FootballerCharacteristicsEnum characteristic, short add) {
        _characteristics[characteristic.array_pos] += add;
    }

    public void decreaseCharacteristic(FootballerCharacteristicsEnum characteristic, short loss) {
        _characteristics[characteristic.array_pos] -= loss;
    }
}