package no.avec.swinggui.gui;

import no.avec.swinggui.repository.entity.MyEntity;
import no.avec.swinggui.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by avec on 22/03/2018.
 */
@Component
public class MainModel {

    @Autowired
    private MyService service;

    List<MyEntity> getAllMyEntities() {
        return service.findAllMyEntities();
    }
}
