package no.avec.swinggui.service;

import no.avec.swinggui.repository.entity.MyEntity;
import no.avec.swinggui.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by avec on 22/03/2018.
 */
@Service
public class MyService {
    @Autowired
    private MyEntityRepository repository;

    public List<MyEntity> findAllMyEntities () {
        return repository.findAll();
    }
}
