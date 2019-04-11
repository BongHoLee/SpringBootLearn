package bh.bongho.demospring17;

import org.springframework.stereotype.Component;

@Component
public class Sample {

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data = 200;


}
