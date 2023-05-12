package org.grupo.tacs.extras;

import org.grupo.tacs.model.Event;
import org.grupo.tacs.model.EventOption;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class UserData{
    String email;
    String id;
    public UserData(String s, String hexString) {
        this.id = hexString;
        this.email = s;
    }
}
class EventOptionData {
    //String id;
    LocalDateTime start;
    LocalDateTime end;
    int votes;
    public EventOptionData(EventOption o) {
        //this.id=o.getId().toHexString(); Quedamos en usar la posicion como indice.
        this.start=o.getStart();
        this.end=o.getEnd();
        this.votes=o.getVotes().size();
    }

    public int getVotes() {
        return votes;
    }
}
public class EventData{
    String id;
    String name;
    String description;
    List<EventOptionData> options;
    // participants: [ { id, email } ]
    String status;
    LocalDateTime createdDate;
    UserData owner;
    public EventData(Event event) {
        this.id=event.getId().toHexString();
        this.name=event.getName();
        this.description = event.getDesc();
        this.status = "Cerrado";
        if(event.getIsActive())
            this.status = "Active";
        this.owner = new UserData(event.getCreatedBy().getEmail(),event.getCreatedBy().getId().toHexString());
        this.createdDate=event.getCreatedDate();
        this.options=transformEventOptions(event.getOptions());
    }
    private List<EventOptionData> transformEventOptions(List<EventOption> options){
        List<EventOptionData> result=new ArrayList<>();
        options.forEach(o->result.add(new EventOptionData(o)));
        return result;
    }

    public List<EventOptionData> getOptions() {
        return options;
    }

    public List<Integer> getVotados(){
        List<Integer> votados = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < this.options.size(); i++) {
            if(this.options.get(i).votes > 0)
                votados.add(i);
        }
        return votados;
    }
}