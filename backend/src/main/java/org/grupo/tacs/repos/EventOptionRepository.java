package org.grupo.tacs.repos;

import org.grupo.tacs.model.EventOption;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventOptionRepository implements Repository<EventOption>{

    public static EventOptionRepository instance = new EventOptionRepository();
    List<EventOption> eventOptions = new ArrayList<>();
    public List<EventOption> findByEventId(Long id){
        return eventOptions.stream().filter(op->op.getEventOptionParentId()==id).collect(Collectors.toList());
    }
    @Override
    public EventOption findById(Long id) {
        return null;
    }

    @Override
    public List<EventOption> findAll() {
        return eventOptions;
    }

    @Override
    public void save(EventOption entidad) {
        if(entidad.getId()==null){
            entidad.setId(eventOptions.stream().count());
            eventOptions.add(entidad);
        }
    }

    @Override
    public void update(EventOption entidad) {

    }

    @Override
    public void delete(EventOption entidad) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(long l) {

    }
}
