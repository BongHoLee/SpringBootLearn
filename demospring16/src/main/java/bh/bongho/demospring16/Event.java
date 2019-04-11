package bh.bongho.demospring16;

public class Event {
    Integer id;
    String title;

    public Event() {

    }

    public Event(Integer id) {
        this.id = id;
    }

    public Event(String title) {
        this.title = title;
    }

    public Event(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
