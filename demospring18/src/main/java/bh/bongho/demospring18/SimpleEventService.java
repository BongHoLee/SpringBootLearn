package bh.bongho.demospring18;


import org.springframework.stereotype.Service;

//target 클래스(Real Subject)
@Service
public class SimpleEventService implements EventService {

    @Override
    public void createEvent(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Created an event");

    }

    @Override
    public void publishEvent() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");


    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an Event");

    }

}
