package bh.bongho.demospring8;

//이벤트는 빈으로 등록하는게 아니다.
//이 이벤트는 내가 원하는 데이터를 담아서 전달됨
public class MyEvent {
    private int data;

    private Object source;

    public MyEvent(Object source, int data){
        this.source = source;
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
